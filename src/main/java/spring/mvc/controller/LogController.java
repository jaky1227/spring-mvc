package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.service.LoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LogController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password,
            ModelMap map,
            HttpServletResponse response){

        boolean isValid = loginService.isValidUser(userName,password);
        if(isValid){
            map.addAttribute("userName",userName);
            return "user";
        }
        return "error";

    }
}
