package com.example.demo.config;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IoCTest {
    @Autowired(required = false)
    private ApplicationContext applicationContext;

    @Test
    public void testIoC(){
        User user = (User) applicationContext.getBean("user1");
        System.out.println(user);
    }
}
