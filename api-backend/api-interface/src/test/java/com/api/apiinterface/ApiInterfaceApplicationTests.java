package com.api.apiinterface;

import com.api.apiclientsdk.client.ApiClient;
import com.api.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class apiInterfaceApplicationTests {

    @Resource
    private ApiClient ApiClient;

    @Test
    void contextLoads() {
        String result = ApiClient.getNameByGet("zhifei");
        User user = new User();
        user.setUsername("zhifei");
        String usernameByPost = ApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
