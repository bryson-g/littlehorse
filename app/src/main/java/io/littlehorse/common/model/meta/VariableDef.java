package io.littlehorse.common.model.meta;

import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.proto.VariableDefPb;
import io.littlehorse.common.proto.VariableDefPbOrBuilder;
import io.littlehorse.common.proto.VariableTypePb;

public class VariableDef extends LHSerializable<VariableDefPb> {

    public VariableTypePb type;
    public String name;

    public ThreadSpec threadSpec;

    public Class<VariableDefPb> getProtoBaseClass() {
        return VariableDefPb.class;
    }

    public void initFrom(MessageOrBuilder proto) {
        VariableDefPbOrBuilder p = (VariableDefPbOrBuilder) proto;
        type = p.getType();
        name = p.getName();
    }

    public VariableDefPb.Builder toProto() {
        VariableDefPb.Builder out = VariableDefPb
            .newBuilder()
            .setType(type)
            .setName(name);

        return out;
    }

    public static VariableDef fromProto(VariableDefPbOrBuilder proto) {
        VariableDef o = new VariableDef();
        o.initFrom(proto);
        return o;
    }
}
