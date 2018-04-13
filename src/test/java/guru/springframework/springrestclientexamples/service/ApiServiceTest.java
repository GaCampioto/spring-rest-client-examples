package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceTest {

    @Autowired
    ApiService apiService;

    @Test
    public void should_get_users_list() {
        int limit = 3;
        List<User> users = apiService.getUsers(limit);

        assertNotNull(users);
        assertFalse(users.isEmpty());
        assertEquals(limit+1, users.size());
    }


}