package br.edu.unifio.ecomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Short> {
    

}
