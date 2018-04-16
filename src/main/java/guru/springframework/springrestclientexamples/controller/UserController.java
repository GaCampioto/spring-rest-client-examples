package guru.springframework.springrestclientexamples.controller;

import guru.springframework.api.domain.User;
import guru.springframework.springrestclientexamples.service.ApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController("/users")
public class UserController {

    ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public ResponseEntity<Flux<User>> getListUsers(@RequestParam int limit) {
        return ResponseEntity.ok(apiService.getUsers(limit));
    }
}
