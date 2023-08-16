/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author christ IKONDO
 */
 

@Controller
public class LoginController {
    @GetMapping("/welcome") public String welcome()
    {
        return "welcome.html";
    }
 
    @GetMapping("/admin") public String user()
    {
        return "admin.html";
    }
 
    @GetMapping("/basic") public String basic()
    {
        return "basic.html";
    }
 
    @GetMapping("/login") public String login()
    {
        return "login.html";
    }
}
