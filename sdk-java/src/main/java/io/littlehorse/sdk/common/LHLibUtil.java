package io.littlehorse.sdk.common;

import static com.google.protobuf.util.Timestamps.fromMillis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.TaskRunIdPb;
import io.littlehorse.sdk.common.proto.TaskRunSourcePb;
import io.littlehorse.sdk.common.proto.VariableTypePb;
import io.littlehorse.sdk.common.proto.VariableValuePb;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class LHLibUtil {

    public static Date fromProtoTs(Timestamp proto) {
        if (proto == null) return null;
        Date out = Date.from(
            Instant.ofEpochSecond(proto.getSeconds(), proto.getNanos())
        );

        if (out.getTime() == 0) {
            out = new Date();
        }

        return out;
    }

    public static Timestamp fromDate(Date date) {
        if (date == null) return null;
        return fromMillis(date.getTime());
    }

    public static <T extends GeneratedMessageV3> T loadProto(
        byte[] data,
        Class<T> cls
    ) throws LHSerdeError {
        try {
            return cls.cast(
                cls.getMethod("parseFrom", byte[].class).invoke(null, data)
            );
        } catch (NoSuchMethodException | IllegalAccessException exn) {
            exn.printStackTrace();
            throw new RuntimeException(
                "Passed in an invalid proto class. Not possible"
            );
        } catch (InvocationTargetException exn) {
            exn.printStackTrace();
            throw new LHSerdeError(
                exn.getCause(),
                "Failed loading protobuf: " + exn.getMessage()
            );
        }
    }

    public static String protoToJson(MessageOrBuilder thing) {
        try {
            return JsonFormat.printer().includingDefaultValueFields().print(thing);
        } catch (InvalidProtocolBufferException exn) {
            exn.printStackTrace();
            return null;
        }
    }

    public static byte[] toProto(GeneratedMessageV3.Builder<?> builder) {
        return builder.build().toByteArray();
    }

    private static ObjectMapper mapper = new ObjectMapper();

    public static String serializeToJson(Object o) throws JsonProcessingException {
        return mapper.writeValueAsString(o);
    }

    public static <T extends Object> T deserializeFromjson(String json, Class<T> cls)
        throws JsonProcessingException {
        return mapper.readValue(json, cls);
    }

    public static String getWfRunId(TaskRunSourcePb taskRunSource) {
        switch (taskRunSource.getTaskRunSourceCase()) {
            case TASK_NODE:
                return taskRunSource.getTaskNode().getNodeRunId().getWfRunId();
            case USER_TASK_TRIGGER:
                return taskRunSource.getUserTaskTrigger().getNodeRunId().getWfRunId();
            case TASKRUNSOURCE_NOT_SET:
            // we end up returning null
        }
        return null;
    }

    public static String taskRunIdToString(TaskRunIdPb taskRunId) {
        return taskRunId.getWfRunId() + "/" + taskRunId.getTaskGuid();
    }

    public static VariableValuePb objToVarVal(Object o) throws LHSerdeError {
        if (o instanceof VariableValuePb) return (VariableValuePb) o;

        VariableValuePb.Builder out = VariableValuePb.newBuilder();
        if (o == null) {
            out.setType(VariableTypePb.NULL);
        } else if (Long.class.isAssignableFrom(o.getClass())) {
            out.setType(VariableTypePb.INT);
            out.setInt((Long) o);
        } else if (Integer.class.isAssignableFrom(o.getClass())) {
            out.setType(VariableTypePb.INT);
            out.setInt((Integer) o);
        } else if (Double.class.isAssignableFrom(o.getClass())) {
            out.setType(VariableTypePb.DOUBLE);
            out.setDouble((Double) o);
        } else if (Float.class.isAssignableFrom(o.getClass())) {
            out.setType(VariableTypePb.DOUBLE);
            out.setDouble((Float) o);
        } else if (o instanceof String) {
            out.setType(VariableTypePb.STR);
            out.setStr((String) o);
        } else if (o instanceof Boolean) {
            out.setType(VariableTypePb.BOOL);
            out.setBool((Boolean) o);
        } else if (o instanceof byte[]) {
            out.setType(VariableTypePb.BYTES);
            out.setBytes(ByteString.copyFrom((byte[]) o));
        } else {
            // At this point, all we can do is try to make it a JSON type.
            String jsonStr;
            try {
                jsonStr = LHLibUtil.serializeToJson(o);
            } catch (JsonProcessingException exn) {
                exn.printStackTrace();
                throw new LHSerdeError(exn, "Failed deserializing json");
            }

            if (List.class.isAssignableFrom(o.getClass())) {
                out.setType(VariableTypePb.JSON_ARR);
                out.setJsonArr(jsonStr);
            } else {
                out.setType(VariableTypePb.JSON_OBJ);
                out.setJsonObj(jsonStr);
            }
        }

        return out.build();
    }

    public static boolean isINT(Class<?> cls) {
        return (
            Integer.class.isAssignableFrom(cls) ||
            Long.class.isAssignableFrom(cls) ||
            int.class.isAssignableFrom(cls) ||
            long.class.isAssignableFrom(cls)
        );
    }

    public static boolean isDOUBLE(Class<?> cls) {
        return (
            Double.class.isAssignableFrom(cls) ||
            Float.class.isAssignableFrom(cls) ||
            double.class.isAssignableFrom(cls) ||
            float.class.isAssignableFrom(cls)
        );
    }

    public static boolean isSTR(Class<?> cls) {
        return String.class.isAssignableFrom(cls);
    }

    public static boolean isBOOL(Class<?> cls) {
        return (
            Boolean.class.isAssignableFrom(cls) || boolean.class.isAssignableFrom(cls)
        );
    }

    public static boolean isBYTES(Class<?> cls) {
        return byte[].class.isAssignableFrom(cls);
    }

    public static boolean isJSON_ARR(Class<?> cls) {
        return List.class.isAssignableFrom(cls);
    }

    public static VariableTypePb javaClassToLHVarType(Class<?> cls) {
        if (isINT(cls)) return VariableTypePb.INT;

        if (isDOUBLE(cls)) return VariableTypePb.DOUBLE;

        if (isSTR(cls)) return VariableTypePb.STR;

        if (isBOOL(cls)) return VariableTypePb.BOOL;

        if (isBYTES(cls)) return VariableTypePb.BYTES;

        if (isJSON_ARR(cls)) return VariableTypePb.JSON_ARR;

        return VariableTypePb.JSON_OBJ;
    }

    public static boolean areVariableValuesEqual(
        VariableValuePb a,
        VariableValuePb b
    ) {
        if (a.getType() != b.getType()) return false;

        switch (a.getType()) {
            case INT:
                return a.getInt() == b.getInt();
            case DOUBLE:
                return a.getDouble() == b.getDouble();
            case STR:
                return a.getStr().equals(b.getStr());
            case BOOL:
                return a.getBool() == b.getBool();
            case JSON_ARR:
                return a.getJsonArr().equals(b.getJsonArr());
            case JSON_OBJ:
                return a.getJsonObj().equals(b.getJsonObj());
            case BYTES:
                return a.getBytes().equals(b.getBytes());
            case NULL:
                return true;
            case UNRECOGNIZED:
            default:
                throw new RuntimeException("Not possible");
        }
    }
}