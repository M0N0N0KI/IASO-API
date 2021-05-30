package com.iaso.iasoapi.models.cadastro;

import com.iaso.iasoapi.models.login.login;
import com.iaso.iasoapi.models.prontuario.prontuario;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class cadastro implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @Column(length = 100 ,nullable = false)
    private String nome_completo;

    @Column(length = 100 ,nullable = false)
    private String nome_mae;

    @Column(length = 11,nullable = false,unique = true)
    private String cpf;

    @Column(length = 11, nullable = false,unique = true)
    private String cns;

    @Column(length = 30,nullable = false)
    private String sexo;

    @Column(length = 100,nullable = false)
    private String raca_cor;

    @Column(length = 11 , nullable = false)
    private BigDecimal cep;

    @Column(length = 30, nullable = false)
    private String bairro;

    @Column(length = 30, nullable = false)
    private String rua;

    @Column(length = 10, nullable = false)
    private String numero_casa;

    @Column(length = 20, nullable = false)
    private String nacionalidade;
    
    @Column(length = 20, nullable = false)
    private String naturalidade;

    @Column(length = 10, nullable = false)
    private String telefone;

    @Column(length = 10, nullable = false)
    private String cartao_sus;

    @Column(nullable = false)
    private Date nascimento;

    @Column(nullable = false)
    private Boolean paciente_funcionario = false;

    @OneToOne
    @JoinColumn(name = "codigo_login", referencedColumnName = "codigo")
    private login codigo_login;

    @OneToMany
    private List<prontuario> prontuarios;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

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

    public login getLogin_codigo() {
        return codigo_login;
    }

    public void setLogin_codigo(login codigo_login) {
        this.codigo_login = codigo_login;
    }

    public List<prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }

    
}
