
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Location {

    private String street;
    private String city;
    private String state;
    private String postcode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
