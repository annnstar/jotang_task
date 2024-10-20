package com.example.mybatis_example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //springboot整合单元测试的注解
class MybatisExampleApplicationTests {
    //依赖注入
    @Autowired
    private UserMapper userMapper;
    @Test //调用UserMapper中的接口信息
    void contextLoads() {
    }

}
