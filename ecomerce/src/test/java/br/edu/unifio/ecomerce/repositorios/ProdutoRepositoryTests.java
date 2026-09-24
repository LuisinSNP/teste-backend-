package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void testBuscarPorId() {
        Optional<Produto> resultado = produtoRepository.findById(1);

        assertTrue(resultado.isPresent());
        Produto p = resultado.get();
        assertEquals("Smartphone Galaxy", p.getNome());
        assertEquals(0, p.getPreco().compareTo(new BigDecimal("1999.90")));

        assertNotNull(p.getCategoria());
        assertEquals("Eletrônicos", p.getCategoria().getNome());
    }

    @Test
    public void testListarTodos() {
        List<Produto> produtos = produtoRepository.findAll();

        assertFalse(produtos.isEmpty());
        assertEquals(5, produtos.size());
    }
}