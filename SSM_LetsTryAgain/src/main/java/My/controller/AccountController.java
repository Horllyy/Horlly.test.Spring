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
        System.out.println("表现层.查询所有账户信息。。");
        List<Account> list=accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account,Model model){
        System.out.println("表现层,保存用户。。");
        accountService.saveAccount(account);
        List<Account> list=accountService.findAll();
        model.addAttribute("list",list);
        return "list";
        //不能直接这样传
    }
}
