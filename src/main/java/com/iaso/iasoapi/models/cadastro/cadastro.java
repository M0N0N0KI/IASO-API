package com.iaso.iasoapi.models.cadastro;

import com.iaso.iasoapi.models.prontuario.prontuario;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    @Column(nullable = false)
    private Boolean paciente_funcionario = false;

    @OneToMany
    private List<prontuario> prontuarios;
}
