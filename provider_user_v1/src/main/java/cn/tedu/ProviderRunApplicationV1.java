package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: hejie
 * @date: 2019/8/28 10:13
 * Created with IntelliJ IDEA.
 * Description: 启动服务器
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderRunApplicationV1 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderRunApplicationV1.class, args);
    }
}

