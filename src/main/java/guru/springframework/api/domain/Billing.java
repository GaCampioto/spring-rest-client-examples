
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Billing {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
