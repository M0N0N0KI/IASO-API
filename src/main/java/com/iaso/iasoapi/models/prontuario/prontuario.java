package com.iaso.iasoapi.models.prontuario;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.iaso.iasoapi.models.cadastro.cadastro;

@Entity
@Table(name = "prontuario")
public class prontuario implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String sintomas;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String condicoes;

    @ManyToOne(cascade = CascadeType.ALL)
    private cadastro cadastro;
}
