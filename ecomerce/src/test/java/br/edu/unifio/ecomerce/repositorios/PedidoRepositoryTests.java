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

import br.edu.unifio.ecomerce.entidades.Pedido;

@SpringBootTest
public class PedidoRepositoryTests {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Test
    public void testBuscarPorId() {
        Optional<Pedido> resultado = pedidoRepository.findById(1);

        assertTrue(resultado.isPresent());
        Pedido pedido = resultado.get();
        assertEquals("CONCLUIDO", pedido.getStatus());
        assertEquals(0, pedido.getValorTotal().compareTo(new BigDecimal("1999.90")));

        assertNotNull(pedido.getCliente());
        assertEquals("João Silva", pedido.getCliente().getNome());
    }

    @Test
    public void testListarTodos() {
        List<Pedido> pedidos = pedidoRepository.findAll();

        assertFalse(pedidos.isEmpty());
        assertEquals(5, pedidos.size());
    }
}