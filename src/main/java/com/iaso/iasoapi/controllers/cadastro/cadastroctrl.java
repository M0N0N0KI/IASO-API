package com.iaso.iasoapi.controllers.cadastro;

import com.iaso.iasoapi.models.cadastro.cadastroRepository;
import com.iaso.iasoapi.models.ficha_cadastro.ficha_cadastro;
import com.iaso.iasoapi.models.login.login;
import com.iaso.iasoapi.models.login.loginRepository;

import java.util.List;

import com.iaso.iasoapi.models.cadastro.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadastro")
public class cadastroctrl {

    @Autowired
    cadastroRepository repocad;
    loginRepository logincad;

    public cadastroctrl(cadastroRepository repocad, loginRepository logincad)
    {
        this.repocad = repocad;
        this.logincad = logincad;
    }

    @GetMapping("/view")
    public List<cadastro> listarCadastros()
    {
        return repocad.findAll();
    }

    
    @PostMapping("/cad")
    public Boolean cadastrar_usuario(@RequestBody cadastro cadastrado)
    {
        if(repocad.save(cadastrado) != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @PostMapping("/cadc")
    public Boolean cadastrar_usuarioC(@RequestBody ficha_cadastro ficha)
    {
        login user = new login();
        user.setNome(ficha.getNome_completo());
        user.setSenha(ficha.getSenha());
        user = logincad.save(user);
        if(user != null)
            {
                cadastro usuario = new cadastro();
                usuario.setNome_completo(ficha.getNome_completo());
                usuario.setNome_mae(ficha.getNome_mae());
                usuario.setCpf(ficha.getCpf());
                usuario.setCns(ficha.getCns());
                usuario.setSexo(ficha.getSexo());
                usuario.setRaca_cor(ficha.getRaca_cor());
                usuario.setCep(ficha.getCep());
                usuario.setBairro(ficha.getBairro());
                usuario.setRua(ficha.getRua());
                usuario.setNumero_casa(ficha.getNumero_casa());
                usuario.setNacionalidade(ficha.getNacionalidade());
                usuario.setNaturalidade(ficha.getNaturalidade());
                usuario.setTelefone(ficha.getTelefone());
                usuario.setCartao_sus(ficha.getCartao_sus());
                usuario.setNascimento(ficha.getNascimento());
                usuario.setPaciente_funcionario(ficha.getPaciente_funcionario());
                usuario.setLogin_codigo(user);
                if(repocad.save(usuario) != null)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        else
        {
            return false;
        }
    }


    //função de carregamento do usuario
    @PostMapping("/load")
    public cadastro carregar_cadastro(@RequestParam("id") long id)
    {
        cadastro usuario = repocad.carregarUsuario(id);

        if(usuario != null)
        {
            return usuario;
        }
        else
        {
            return null;
        }
    }
}
