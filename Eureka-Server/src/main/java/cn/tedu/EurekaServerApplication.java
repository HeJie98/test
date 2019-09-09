package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: hejie
 * @date: 2019/8/28 11:57
 * Created with IntelliJ IDEA.
 * Description: 该项目为Eureka服务端，其他服务者以及消费者都是在此项目之下，因为是服务端所以使用EnableRurekaServer注解
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
