package br.edu.unifio.ecomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}