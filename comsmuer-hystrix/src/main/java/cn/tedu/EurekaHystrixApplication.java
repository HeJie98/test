package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: hejie
 * @date: 2019/8/28 10:13
 * Created with IntelliJ IDEA.
 * Description: 启动服务器
 */
@SpringCloudApplication
@EnableFeignClients
public class EurekaHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixApplication.class,args);
    }
}
