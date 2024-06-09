package br.com.fiap.produtomvc.controllers;

import br.com.fiap.produtomvc.model.Focos;
import br.com.fiap.produtomvc.services.OceanViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/api/oceanview")
public class OceanViewController {

    @Autowired
    private OceanViewService oceanViewService;

    @GetMapping("/praias")
    public String getVesselData(Model model) {
        int cont=0;
        List<Focos> praiasPoluidas= oceanViewService.getAllTest();
        model.addAttribute("focos", praiasPoluidas);
        return "/focosdepoluicao";
    }
}