package cn.hexz.knoworno;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "测试类")
@RequestMapping("/root")
public class Test {

    @GetMapping("/test")
    @ApiOperation(value = "测试启动方法",notes = "测试启动方法")
    public String test() {
        System.out.println("springboot启动成功！");
        return "springboot启动成功！";
    }
}
