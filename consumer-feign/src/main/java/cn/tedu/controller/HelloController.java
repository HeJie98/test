package cn.tedu.controller;

import cn.tedu.feign.HelloFrign;
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

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        //提供者的url
        String url = "http://localhost:7777/hello/"+name;
        url ="http://provider-user/hello"+name;
        return helloFrign.hello(name);
    }

    @RequestMapping("random")
    public String hello(){
        String url = "http://localhost:6969/random/";
        url = "http://provider-user/random";
        return helloFrign.random();
    }
}
