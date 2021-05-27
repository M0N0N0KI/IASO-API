package com.iaso.iasoapi.models.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface cadastroRepository extends JpaRepository<cadastro, Long>{

    @Query("select C from cadastro C where C.codigo_login = ?1")
    public cadastro carregarUsuario(Long id);
}
