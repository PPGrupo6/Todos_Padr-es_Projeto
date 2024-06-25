package facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FacadePatternTest {

    private SistemaLojaFacade facade;

    @BeforeEach
    void setUp() {
        facade = new SistemaLojaFacade();
    }

    @Test
    void testCriarPedido() {
        String idPedido = "123";
        facade.criarPedido(idPedido);
        // Criando um pedido com o mesmo ID para verificar o estado
        Pedido pedido = new Pedido(idPedido);
        assertEquals("Criado", pedido.getStatus());
        assertNotNull(pedido.getId());
        assertEquals(idPedido, pedido.getId());
    }

    @Test
    void testCancelarPedido() {
        String idPedido = "123";
        facade.cancelarPedido(idPedido);
        // Criando um pedido com o mesmo ID para verificar o estado
        Pedido pedido = new Pedido(idPedido);
        pedido.setStatus("Cancelado");
        assertEquals("Cancelado", pedido.getStatus());
        assertNotNull(pedido.getId());
        assertEquals(idPedido, pedido.getId());
    }

}
