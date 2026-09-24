package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Categoria;

@SpringBootTest
public class CategoriaRepositoryTests {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Test
    public void testBuscarPorId() {
        Optional<Categoria> resultado = categoriaRepository.findById((short) 1);

        assertTrue(resultado.isPresent());
        Categoria categoria = resultado.get();
        assertEquals("Eletrônicos", categoria.getNome());
        assertEquals("Produtos eletrônicos em geral", categoria.getDescricao());
    }

    @Test
    public void testListarTodos() {
        List<Categoria> categorias = categoriaRepository.findAll();

        assertFalse(categorias.isEmpty());
        assertEquals(5, categorias.size());
    }
}