package com.devtreino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
