package br.edu.unifio.ecomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}