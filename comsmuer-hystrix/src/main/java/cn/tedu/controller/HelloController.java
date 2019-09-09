package cn.tedu.controller;

import cn.tedu.feign.HelloFrign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: hejie
 * @date: 2019/8/28 10:22
 * Created with IntelliJ IDEA.
 * Description:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloFrign helloFrign;

    @HystrixCommand(fallbackMethod = "fallbackHello")
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        //提供者的url
        String url = "http://localhost:7777/hello/"+name;
        url ="http://provider-user/hello"+name;
        return helloFrign.hello(name);
    }

    @RequestMapping("random")
    @HystrixCommand(fallbackMethod = "fallbackRandom")
    public String hello(){
        String url = "http://localhost:6969/random/";
        url = "http://provider-user/random";
        return helloFrign.random();
    }

    /**
     * 断路器方法，返回值要和方法一致，参数也要一致
     * 用于处理Hello请求
     * 当发生异常时，直接返回默认值，这种形式称为降级
     */
    public String fallbackHello(String name){
        return "请求超时，请稍后重试,fallbackHello";
    }

    /**
     * 断路器方法，返回值要和方法一致，参数也要一致
     * 用于处理Random请求
     * @return
     */
    public String fallbackRandom(){
        return "请求超时，请稍后重试，fallbackRandom";
    }
}
