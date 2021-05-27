package com.iaso.iasoapi.controllers.cadastro;

import java.util.List;

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

    //funções de visualizar dados

    //retornar lista de cadastros

    @GetMapping("/view")
    public List<cadastro> listarCadastros()
    {
        return repocad.findAll();
    }

    //Funções de Cadastrar usuario
    @PostMapping("/cad")
    public Boolean cadastrar_usuario(@RequestBody cadastro cad)
    {
        cadastro resposta = repocad.save(cad);
        if(resposta != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
