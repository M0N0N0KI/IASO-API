package com.iaso.iasoapi.models.fila_virtual;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iaso.iasoapi.models.prontuario.prontuario;

@Entity
@Table(name = "fila_virtual")
public class fila_virtual implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @Column(nullable = false)
    private int vaga;

    @OneToOne
    @JoinColumn(name = "codigo_prontuario", referencedColumnName = "codigo")
    private prontuario prontuario;
}
