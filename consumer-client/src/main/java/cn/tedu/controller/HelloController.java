package cn.tedu.controller;

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
    private RestTemplate restTemplate;

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        //提供者的url
        String url = "http://localhost:7777/hello/"+name;
        url ="http://provider-user/hello"+name;
        return restTemplate.getForObject(url,String.class);
    }

    @RequestMapping("random")
    public String hello(){
        String url = "http://localhost:6969/random/";
        url = "http://provider-user/random";
        return restTemplate.getForObject(url,String.class);
    }
}
