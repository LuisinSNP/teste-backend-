package br.edu.unifio.ecomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}