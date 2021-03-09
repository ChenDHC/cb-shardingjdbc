package com.cb;

import com.cb.shardingjdbc.entity.User;
import com.cb.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShadingjdbcApplication.class)
//@SpringBootTest
class ShadingjdbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testAddUser() {
        for (long i = 0; i < 10; i++) {
            User user = new User();
            user.setGender("0");
            user.setPassword("00000000000");
            user.setUsername("-->" + i);
            user.setId(i);
            userMapper.insert(user);
        }
    }


}
