package My.controller;

import exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("执行了testException方法...");
        try {
            //模拟异常
            int i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            //向上抛出自定义异常信息
            throw new SysException("出现了一些错误");
        }
        return "succeed";
    }

}
