package com.projectfacul.projectfacul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

    @RequestMapping("/novoCadastro")
    public String form(){
        return "formCadastro";

    }

}
