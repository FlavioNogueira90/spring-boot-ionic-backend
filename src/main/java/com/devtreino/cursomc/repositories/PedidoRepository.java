package com.devtreino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
