package com.iaso.iasoapi.models.checagem_informacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iaso.iasoapi.models.fila_virtual.fila_virtual;

@Entity
@Table(name = "checagem_informacao")
public class checagemInformacao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @OneToOne
    @JoinColumn(name = "codigo_fila", referencedColumnName = "codigo")
    private fila_virtual posicao_fila;
    
}
