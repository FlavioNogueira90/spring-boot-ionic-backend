package com.devtreino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
