package com.practicas_1.practicas_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ejemploController {
    @GetMapping("/detallesinfo")
    public String info(Model model){
        model.addAttribute("titulo", "servidor en line");
        
        return "detallesinfo";
    }

}
