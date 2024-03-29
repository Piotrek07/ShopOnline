package pl.shoponline.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/myAccount")
    public String myAccount(){
        return "myAccount";
    }

    @GetMapping ("/login")
    public String login(Model model){
        model.addAttribute("classActiveLogin", true);
        return "myAccount";
    }
}


