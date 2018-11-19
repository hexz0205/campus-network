package cn.hexz.campus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test")
    public String test() {
        System.out.println("springboot启动成功！");
        return "springboot启动成功！";
    }
}
