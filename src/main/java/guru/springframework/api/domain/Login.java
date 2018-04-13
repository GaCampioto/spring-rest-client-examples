
package guru.springframework.api.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Login {

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
