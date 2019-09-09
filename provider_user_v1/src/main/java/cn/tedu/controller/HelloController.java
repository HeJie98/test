package cn.tedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: hejie
 * @date: 2019/8/28 10:22
 * Created with IntelliJ IDEA.
 * Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "V1 :"+name;
    }
    @RequestMapping("random")
    public String random(){
        UUID uuid = UUID.randomUUID();
        return "V1  "+uuid+"";
    }
}

