package com.iaso.iasoapi.models.dashboard;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iaso.iasoapi.models.gerenciamento_cadastro.gerenciamentoCadastro;
import com.iaso.iasoapi.models.mapeamento_area.mapeamentoArea;
import com.iaso.iasoapi.models.rastreamento_paciente.rastreamentoPaciente;

@Entity
@Table(name = "dashboard")
public class dashboard implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @OneToOne
    @JoinColumn(name = "codigo_mapear", referencedColumnName = "codigo")
    private mapeamentoArea mapeamento;

    @OneToOne
    @JoinColumn(name = "codigo_rastreamento", referencedColumnName = "codigo")
    private rastreamentoPaciente rastreamento;

    @OneToOne
    @JoinColumn(name = "codigo_cadastro", referencedColumnName = "codigo")
    private gerenciamentoCadastro gerenciamento;

}
