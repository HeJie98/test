package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: hejie
 * @date: 2019/8/28 14:10
 * Created with IntelliJ IDEA.
 * Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderRunApplicationV2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRunApplicationV2.class,args);
    }
}
