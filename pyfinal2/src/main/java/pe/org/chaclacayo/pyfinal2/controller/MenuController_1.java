/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/auth/main_ds")
public class MenuController_1 {
    
    @GetMapping
    public String main_ds(){
        return "main_ds";
    }
    @GetMapping("/perfil_ds")
    public String perfil_ds(){
        return "perfil_ds";
    }
}
