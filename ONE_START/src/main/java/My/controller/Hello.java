package My.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类

@Controller
public class Hello {

    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "succeed";
    }
}
