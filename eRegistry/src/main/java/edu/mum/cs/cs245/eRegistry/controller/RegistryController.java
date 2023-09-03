package edu.mum.cs.cs245.eRegistry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RegistryController {

    @GetMapping(value = {"/", "/eRegistry","/eRegistry/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
