package com.devtreino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
