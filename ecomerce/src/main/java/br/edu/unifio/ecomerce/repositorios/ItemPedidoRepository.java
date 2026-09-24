package br.edu.unifio.ecomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}