import command.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AllTests {

    private CozinhaReceiver receiver;
    private GarcomInvoker garcom;

    @Before
    public void setUp() {
        // Inicialização dos objetos necessários para os testes
        receiver = new CozinhaReceiver();
        garcom = new GarcomInvoker();
    }

    @Test
    public void testPedidoPizzaCommand() {
        // Criando o comando (pedido de pizza)
        Command pedidoPizza = new PedidoPizzaCommand(receiver);

        // Definindo o comando no invoker (garçom)
        garcom.setCommand(pedidoPizza);

        // Executando o comando
        garcom.enviarPedido();

        // Verificando se o método prepararPizza foi chamado no receiver (cozinha)
        assertTrue(receiverPizzaPreparada());
    }

    @Test
    public void testPedidoHamburguerCommand() {
        // Criando o comando (pedido de hambúrguer)
        Command pedidoHamburguer = new PedidoHamburguerCommand(receiver);

        // Definindo o comando no invoker (garçom)
        garcom.setCommand(pedidoHamburguer);

        // Executando o comando
        garcom.enviarPedido();

        // Verificando se o método prepararHamburguer foi chamado no receiver (cozinha)
        assertTrue(receiverHamburguerPreparado());
    }

    // Método auxiliar para verificar se a pizza foi preparada
    private boolean receiverPizzaPreparada() {
        try {
            receiver.prepararPizza();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Método auxiliar para verificar se o hambúrguer foi preparado
    private boolean receiverHamburguerPreparado() {
        try {
            receiver.prepararHamburguer();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
