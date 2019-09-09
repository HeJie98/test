package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: hejie
 * @date: 2019/8/28 10:13
 * Created with IntelliJ IDEA.
 * Description: 启动服务器
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {
    //创建模板对象
    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
