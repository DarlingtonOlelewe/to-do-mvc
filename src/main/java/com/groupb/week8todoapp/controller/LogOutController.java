package com.groupb.week8todoapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;
@Controller
public class LogOutController {
    @GetMapping("/logout")
    public String logout(Model model, HttpSession session){
        session.invalidate();
        return "index";
    }
}