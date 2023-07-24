package com.devtreino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
