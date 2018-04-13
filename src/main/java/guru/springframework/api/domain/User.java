
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class User {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
