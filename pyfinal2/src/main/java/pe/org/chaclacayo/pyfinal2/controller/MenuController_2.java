/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.org.chaclacayo.pyfinal2.entity.Os;
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
        model.addAttribute("os", osService.readAll());
        return "/main_os";
    }

    @GetMapping("/form")
    public String createOs(Model model){
        model.addAttribute("os", new Os());
        return "/agregar_os";
    }
    @PostMapping("/add")
    public String saveOs(@Valid @ModelAttribute Os os, BindingResult result, Model model, RedirectAttributes attributes){
        osService.create(os);
        return "redirect:/auth/all";
    }
    
    @GetMapping("/del/{idos}")
    public String deleteOs(@PathVariable("idos") Integer idos ){
        osService.delete(idos);
        return "redirect:/auth/all";
    }

    @GetMapping("/edit/{idos}")
    public String editOs(Model model, @PathVariable("idos") Integer idos ){
        Os os = osService.read(idos);
        model.addAttribute("os", os);
        return "/agregar_os";
    }

    @PostMapping("/{idos}")
    public String readJD(Model model, @PathVariable("id") Integer id ){
        model.addAttribute("os", osService.read(id));
        return "/auth";
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