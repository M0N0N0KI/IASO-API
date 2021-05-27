package com.iaso.iasoapi.controllers.login;

import java.util.List;

import com.iaso.iasoapi.models.login.login;
import com.iaso.iasoapi.models.login.loginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/iaso")
public class loginctrl {

    //associando ao repositorio de login
    @Autowired
    loginRepository repologin;

    //funções de visualisar dados

    //listar usuarioas
    @GetMapping("/view_usuarios")
    public List<login> listarProdutos()
    {
        return repologin.findAll();
    }

    //funções de inserção de dados

    //cadastrar login
    @PostMapping("/cad_usuarios")
    public login cadastrarUsuario(@RequestBody login log)
    {
        return repologin.save(log);
    }
}
