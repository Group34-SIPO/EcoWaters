package br.com.fiap.produtomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ControllerHome {

    @GetMapping("")
    public String home(){

        return "/index";
    }

    @GetMapping("/comoajudar")
    public String comoAjudar(){

        return "/comoajudar";
    }

    @GetMapping("/especiesemrisco")
    public String especiesemrisco(){

        return "/especiesemrisco";
    }

}
