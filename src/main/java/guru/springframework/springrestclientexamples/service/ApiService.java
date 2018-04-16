package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

@Service
public class ApiService {

    RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Flux<User> getUsers(Integer limit) {
        return Flux.fromIterable(restTemplate
                .getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class)
                .getData());
    }
}
