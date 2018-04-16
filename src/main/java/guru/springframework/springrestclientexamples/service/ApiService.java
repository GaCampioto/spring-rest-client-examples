package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ApiService {

    RestTemplate restTemplate;

    @Value("${api.url}")
    String apiUrl;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Flux<User> getUsers(Mono<Integer>
                                       limit) {
        return WebClient
                .create(apiUrl)
                .get()
                .uri(uriBuilder -> uriBuilder.path("/user").queryParam("limit", limit.block()).build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(UserData.class))
                .flatMapIterable(UserData::getData);
    }
}
