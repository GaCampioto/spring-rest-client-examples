
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Card {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
