/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.org.chaclacayo.pyfinal2.servicios.OsService;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/auth")
public class MenuController_2 {
    
    @Autowired
    private OsService osService;
    
    @GetMapping("/all")
    public String listarOs(Model model){
        //String keyword = "Yogurt";
        model.addAttribute("os", osService.readAll());
        return "/main_os";
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
