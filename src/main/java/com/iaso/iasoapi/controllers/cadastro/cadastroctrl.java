package com.iaso.iasoapi.controllers.cadastro;

import com.iaso.iasoapi.models.cadastro.cadastroRepository;
import com.iaso.iasoapi.models.cadastro.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadastro")
public class cadastroctrl {

    @Autowired
    cadastroRepository repocad;

    public cadastroctrl(cadastroRepository repocad)
    {
        this.repocad = repocad;
    }

    
    @PostMapping("/cad")
    public Boolean cadastrar_usuario(@RequestBody cadastro usuario)
    {
        if(repocad.save(usuario) != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //função de carregamento do usuario
    @PostMapping("/load")
    public cadastro carregar_cadastro(@RequestBody long id)
    {
        return repocad.carregarUsuario(id);
    }
}
