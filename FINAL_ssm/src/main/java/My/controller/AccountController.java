package My.controller;

import My.domain.Account;
import My.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户信息。。。");
        List<Account> accountList=accountService.findAll();
        System.out.println("遍历开始,accountList="+accountList);
//        for (Account account :accountList) {
//            System.out.println("进入foreach遍历account");
//            System.out.println(account);
//        }
        System.out.println("遍历结束");
        model.addAttribute("accountList",accountList);
        return "list";
    }

}
