package com.practicas_1.practicas_1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ejemploResController {
    @GetMapping("/detallesinfo")
    public String info(){
        Map<String, o
       
        
        return "detallesinfo";
    }

}
