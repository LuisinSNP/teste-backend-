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

import br.edu.unifio.ecomerce.entidades.ItemPedido;

@SpringBootTest
public class ItemPedidoRepositoryTests {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @Test
    public void testBuscarPorId() {
        Optional<ItemPedido> resultado = itemPedidoRepository.findById(1);

        assertTrue(resultado.isPresent());
        ItemPedido item = resultado.get();
        assertEquals(1, item.getQuantidade());
        assertEquals(0, item.getValorUnitario().compareTo(new BigDecimal("1999.90")));

        assertNotNull(item.getPedido());
        assertNotNull(item.getProduto());
        assertEquals("Smartphone Galaxy", item.getProduto().getNome());
    }

    @Test
    public void testListarTodos() {
        List<ItemPedido> itens = itemPedidoRepository.findAll();

        assertFalse(itens.isEmpty());
        assertEquals(5, itens.size());
    }
}