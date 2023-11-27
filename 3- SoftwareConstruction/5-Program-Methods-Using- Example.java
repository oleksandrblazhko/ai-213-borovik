package com.example.blazkolab9.controller;

import com.example.blazkolab9.model.SafeEcoBot;
import com.example.blazkolab9.service.SafeEcoBotService;
import com.example.blazkolab9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private SafeEcoBotService safeEcoBotService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String login() {
        return "main-page";
    }


    @PostMapping("/air-info")
    public String airStateInfo(@RequestParam String username, @RequestParam String location, Model model) {

        SafeEcoBot safeEcoBot = new SafeEcoBot();
        String airInfo = safeEcoBot.checkAir(username, location);
        model.addAttribute("airInfo", airInfo);

        return "air-info";
    }

}
