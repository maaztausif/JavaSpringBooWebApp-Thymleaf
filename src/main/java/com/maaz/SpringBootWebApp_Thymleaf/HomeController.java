package com.maaz.SpringBootWebApp_Thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home is open!");
        return  "index";
    }

    @RequestMapping("addAlien")
    public  String addAlien(@ModelAttribute("alien") Alien alien){

        System.out.println("AddAliean is open!");

        return "result";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }

}
