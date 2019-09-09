package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用服务提供者
 * 定义这个借口，相当于一个功能性接口，在Controller中进行调用（动态代理）
 * 下面注解为 Feign的客户端
 */
@FeignClient("provider-user")
public interface HelloFrign {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);

    @RequestMapping("random")
    String random();
}
