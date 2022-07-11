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
@RequestMapping("/auth/main_pv")
public class MenuController_3 {
    
    @GetMapping
    public String main_pv(){
        return "main_pv";
    }
    @GetMapping("/perfil_pv")
    public String perfil_pv(){
        return "perfil_pv";
    }
}
