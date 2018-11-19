package cn.hexz.campus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@SpringBootConfiguration
@EnableAutoConfiguration
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
