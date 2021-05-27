package com.iaso.iasoapi.models.login;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class login implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @Column(length = 100)
    private String nome;

    private String senha;

    public void setCodigo(long codigo)
    {
        this.codigo = codigo;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public long getCodigo()
    {
        return this.codigo;
    }

    public String getNome()
    {
        return this.nome;
    }
    
    public String getSenha()
    {
        return this.senha;
    }

}