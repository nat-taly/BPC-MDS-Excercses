package com.example.bpcmdsex04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @GetMapping("/myself")
    public String getMe(@RequestParam(name="name", required=false, defaultValue="Natálie Vychodilová") String name, @RequestParam(defaultValue = "230911") Integer id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "myself";
    }

    @GetMapping("/alice")
    public String getAlice(Model model){
        model.addAttribute("name", "Alice");
        return "template";
    }

    @GetMapping("/bob")
    public String getBob(Model model){
        model.addAttribute("name", "Bob");
        return "template";
    }

}
