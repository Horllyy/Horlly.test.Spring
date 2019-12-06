package My.controller;

import My.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/accountController")
public class AccountController {


    @RequestMapping("/saveAccount")
    public String saveAccount(Account account,String username) {
        System.out.println("执行了saveAccount方法");
        System.out.println(account);
        System.out.println("usernaem="+username);
        System.out.println("account.username="+account.getUsername());
        return "succeed";
    }

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        response.resetBuffer();
        System.out.println("执行了testServlet方法");
        System.out.println("request=  "+request);
        System.out.println("response=  "+response);
        HttpSession session=request.getSession();
        System.out.println("session=  "+session);
        ServletContext servletContext=session.getServletContext();
        System.out.println("servletContext=  "+servletContext);
        return "succeed";
    }
}
