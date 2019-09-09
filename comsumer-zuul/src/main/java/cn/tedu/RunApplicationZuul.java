package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: hejie
 * @date: 2019/8/29 15:12
 * Created with IntelliJ IDEA.
 * Description:
 */
/**
 *  启动Zuul API Gateway
 */
@SpringBootApplication
@EnableZuulProxy
public class RunApplicationZuul {
    public static void main(String[] args) {
        SpringApplication.run(RunApplicationZuul.class,args);
    }
}
