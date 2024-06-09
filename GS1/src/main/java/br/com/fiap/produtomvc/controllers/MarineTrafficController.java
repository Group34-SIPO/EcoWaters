package br.com.fiap.produtomvc.controllers;

import br.com.fiap.produtomvc.model.Navio;
import br.com.fiap.produtomvc.services.MarineTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/api/marinetraffic")
public class MarineTrafficController {

    @Autowired
    public MarineTrafficService marineTrafficService;

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @GetMapping("/vessels")
    public String getVesselData(Model model) {
        int cont=0;
        List<Navio> navios= marineTrafficService.getAllTest();
        model.addAttribute("navios", navios);
        model.addAttribute("cont", cont);
        for (Navio navio : navios) {
            System.out.println(navio.getVesselName());
        }
        return "/trafegomaritmo";

    }
}