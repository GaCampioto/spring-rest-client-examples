
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ExpirationDate {

    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
