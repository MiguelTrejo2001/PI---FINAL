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
@RequestMapping("/auth/main_os")
public class MenuController_2 {
    
    @GetMapping
    public String main_os(){
        return "main_os";
    }
    @GetMapping("/perfil_os")
    public String perfil_os(){
        return "perfil_os";
    }
    @GetMapping("/editar_os")
    public String editar_os(){
        return "editar_os";
    }
    @GetMapping("/agregar_os")
    public String agregar_os(){
        return "agregar_os";
    }
    
}
