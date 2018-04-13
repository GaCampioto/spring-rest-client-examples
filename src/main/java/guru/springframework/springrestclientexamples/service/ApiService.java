package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiService {

    RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getUsers(Integer limit) {
        return restTemplate
                .getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class)
                .getData();
    }
}
