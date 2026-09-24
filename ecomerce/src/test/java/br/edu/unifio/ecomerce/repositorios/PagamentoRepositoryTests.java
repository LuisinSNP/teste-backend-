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

import br.edu.unifio.ecomerce.entidades.Pagamento;

@SpringBootTest
public class PagamentoRepositoryTests {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Test
    public void testBuscarPorId() {
        Optional<Pagamento> resultado = pagamentoRepository.findById(1);

        assertTrue(resultado.isPresent());
        Pagamento pagamento = resultado.get();
        assertEquals("APROVADO", pagamento.getStatus());
        assertEquals(0, pagamento.getValor().compareTo(new BigDecimal("1999.90")));

        assertNotNull(pagamento.getPedido());
        assertEquals("CONCLUIDO", pagamento.getPedido().getStatus());
    }

    @Test
    public void testListarTodos() {
        List<Pagamento> pagamentos = pagamentoRepository.findAll();

        assertFalse(pagamentos.isEmpty());
        assertEquals(5, pagamentos.size());
    }
}