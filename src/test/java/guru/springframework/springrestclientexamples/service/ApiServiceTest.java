package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceTest {

    @Autowired
    ApiService apiService;

    @Test
    public void should_get_users_list() {
        Mono<Integer> limit = Mono.just(3);
        Flux<User> userFlux = apiService.getUsers(limit);

        List<User> users = userFlux.toStream().collect(Collectors.toList());

        assertNotNull(users);
        assertFalse(users.isEmpty());
        assertEquals(limit.block()+1, users.size());
    }


}