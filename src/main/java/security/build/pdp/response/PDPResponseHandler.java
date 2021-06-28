package security.build.pdp.response;

import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Component;

@Component
public class PDPResponseHandler {

    public Boolean HandleResponse(Map<String, Object> response) {
        return response.get("result").equals(true);
    }

    public Boolean HandleResponse(Map<String, Object> response, String key){
        return ((Map)response.get("result")).get(key).equals(true);
    }
}
