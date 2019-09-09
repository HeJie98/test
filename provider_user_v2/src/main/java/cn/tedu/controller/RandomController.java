package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: hejie
 * @date: 2019/8/28 14:13
 * Created with IntelliJ IDEA.
 * Description:
 */
@RestController
public class RandomController {
    @RequestMapping("random")
    public String random(){
        UUID uuid = UUID.randomUUID();
        return "V2  "+uuid+"";
    }
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "V2 :"+name;
    }
}
