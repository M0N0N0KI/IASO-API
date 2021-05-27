package com.iaso.iasoapi.models.rastreamento_paciente;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iaso.iasoapi.models.checagem_informacao.checagemInformacao;
import com.iaso.iasoapi.models.prontuario.prontuario;

@Entity
@Table(name = "rastreamento_paciente")
public class rastreamentoPaciente implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @OneToOne
    @JoinColumn(name = "codigo_paciente", referencedColumnName = "codigo")
    private checagemInformacao informacao;

    @OneToOne
    @JoinColumn(name = "prontuario_codigo", referencedColumnName = "codigo")
    private prontuario prontuario;

}
