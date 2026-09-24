package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Cliente;

@SpringBootTest
public class ClienteRepositoryTests {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void testBuscarPorId() {
        Optional<Cliente> resultado = clienteRepository.findById(1);

        assertTrue(resultado.isPresent());
        Cliente cliente = resultado.get();
        assertEquals("João Silva", cliente.getNome());
        assertEquals("joao.silva@email.com", cliente.getEmail());
    }

    @Test
    public void testListarTodos() {
        List<Cliente> clientes = clienteRepository.findAll();

        assertFalse(clientes.isEmpty());
        assertEquals(5, clientes.size());
    }
}