package com.iaso.iasoapi.models.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<login, Long>{

    @Query("select L from login L where L.nome = ?1 AND L.senha = ?2")
    public login efetuarlogin(String nome,String senha);
    
}
