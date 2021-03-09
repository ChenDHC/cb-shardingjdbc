package com.cb;

import com.cb.ShadingjdbcApplication;
import com.cb.shardingjdbc.entity.User;

import com.cb.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShadingjdbcApplication.class)
//@SpringBootTest
class ShadingjdbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testAddUser() {
        for (int i = 0; i < 6; i++) {
            User user = new User();
            user.setGender("0");
            user.setPassword(UUID.randomUUID().toString().substring(0, 5));
            user.setUsername("-->" + i);
            userMapper.insert(user);
        }
    }


}
