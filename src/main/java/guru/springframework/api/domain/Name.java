
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Name {

    private String title;
    private String first;
    private String last;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
