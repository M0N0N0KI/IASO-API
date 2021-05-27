package com.iaso.iasoapi.models.mapeamento_area;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapeamento_area")
public class mapeamentoArea implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @Column(length = 100, nullable = false)
    private String bairro;
    
    @Column(nullable = false)
    private int infectados;

    @Column(length = 100, nullable = false)
    private String zona;
}
