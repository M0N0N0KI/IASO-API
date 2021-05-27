package com.iaso.iasoapi.models.login;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class loginRepoManual {

    private final EntityManager en;

    public loginRepoManual(EntityManager en)
    {
        this.en = en;
    }

    public login encontrarPorNome(String nome)
    {
        String query = "select l from login l where u.nome = ";
        if(nome != null)
        {
            query += nome;
        }

        var q = en.createQuery(query, login.class);
        return q.getSingleResult();
    }
    
}
