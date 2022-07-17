
package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.org.chaclacayo.pyfinal2.servicios.OsService;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    
    @Autowired
    private OsService osService;

    @GetMapping("/all")
    public String listarOs(Model model){
        return "login";
    }

    @GetMapping("/login")
    public String login(Model model, @AuthenticationPrincipal User user) {
        //model.addAttribute("user", user.getUsername());
        model.addAttribute("os", osService.readAll());
        return "login";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Bienvenido a Thymeleaf");
        return "/main_general";
    }
    @GetMapping("/register")
    public String register(){
        return "formRegister";
    }
    @GetMapping("/cambiarcontra")
    public String cambiarcontra(){
        return "cambiarcontraseña";
    }
}
