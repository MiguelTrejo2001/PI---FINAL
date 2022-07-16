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
@RequestMapping("/auth/main_mp")
public class MenuController {
    
    @GetMapping
    public String main_mp(){
        return "main_mp";
    }
    @GetMapping("/perfil_mp")
    public String perfil_mp(){
        return "perfil_mp";
    }
    @GetMapping("/visualizar")
    public String visualizar(){
        return "visualizar";
    }
}
