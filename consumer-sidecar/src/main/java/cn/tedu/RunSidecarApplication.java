package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * Sidecar的启动类
 */
@SpringBootApplication
@EnableSidecar
public class RunSidecarApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunSidecarApplication.class,args);
    }
}
