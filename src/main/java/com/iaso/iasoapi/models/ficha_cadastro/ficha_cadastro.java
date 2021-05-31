package com.iaso.iasoapi.models.ficha_cadastro;

import java.math.BigDecimal;
import java.sql.Date;

public class ficha_cadastro {
    
    private String nome_completo;
    private String nome_mae;
    private String cpf;
    private String cns;
    private String sexo;
    private String raca_cor;
    private BigDecimal cep;
    private String bairro;
    private String rua;
    private String numero_casa;
    private String nacionalidade;
    private String naturalidade;
    private String telefone;
    private String cartao_sus;
    private Date nascimento;
    private Boolean paciente_funcionario;
    private String senha;

    
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getNome_mae() {
        return nome_mae;
    }
    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCns() {
        return cns;
    }
    public void setCns(String cns) {
        this.cns = cns;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca_cor() {
        return raca_cor;
    }
    public void setRaca_cor(String raca_cor) {
        this.raca_cor = raca_cor;
    }
    public BigDecimal getCep() {
        return cep;
    }
    public void setCep(BigDecimal cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero_casa() {
        return numero_casa;
    }
    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCartao_sus() {
        return cartao_sus;
    }
    public void setCartao_sus(String cartao_sus) {
        this.cartao_sus = cartao_sus;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public Boolean getPaciente_funcionario() {
        return paciente_funcionario;
    }
    public void setPaciente_funcionario(Boolean paciente_funcionario) {
        this.paciente_funcionario = paciente_funcionario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}
