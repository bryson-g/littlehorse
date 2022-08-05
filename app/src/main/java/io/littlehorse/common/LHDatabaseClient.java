package io.littlehorse.common;

import org.apache.kafka.streams.state.HostInfo;
import io.littlehorse.common.exceptions.LHConnectionError;
import io.littlehorse.common.exceptions.LHSerdeError;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.model.meta.TaskDef;
import io.littlehorse.common.util.LHApiClient;
import io.littlehorse.server.model.internal.LHResponse;

public class LHDatabaseClient {
    private LHApiClient client;
    private HostInfo apiHostInfo;

    public LHDatabaseClient(LHConfig config) {
        this.client = config.getApiClient();
        this.apiHostInfo = config.getApiHostInfo();
    }

    public TaskDef getTaskDef(String idOrName) throws LHConnectionError {
        byte[] response = client.getResponse(apiHostInfo, "/TaskDef/" + idOrName);
        if (response == null) return null;

        LHResponse resp;
        try {
            resp = LHSerializable.fromJson(
                new String(response), LHResponse.class
            );
        } catch (LHSerdeError exn) {
            throw new LHConnectionError(exn, "Got an unrecognizable response: ");
        }

        switch (resp.code) {
        case OK:
            return (TaskDef) resp.result;

        case CONNECTION_ERROR:
            throw new LHConnectionError(null, resp.message);

        case NOT_FOUND_ERROR:
            return null;

        case BAD_REQUEST_ERROR:
        case VALIDATION_ERROR:
        case UNRECOGNIZED:
        default:
            // This really shouldn't be possible.
            throw new LHConnectionError(null, "Mysterious error: " + resp.toJson());
        }

    }
}
