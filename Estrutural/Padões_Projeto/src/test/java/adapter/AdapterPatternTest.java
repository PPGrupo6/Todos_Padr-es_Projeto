package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AdapterPatternTest {

    @Test
    public void testPagamentoLegado() {
        ProcessadorPagamento processadorLegado = new AdaptadorPagamentoLegado(new PagamentoLegadoAPI());
        assertDoesNotThrow(() -> processadorLegado.pagar(100.0));
    }

    @Test
    public void testNovoPagamento() {
        ProcessadorPagamento novoProcessador = new AdaptadorNovaPagamento(new NovaPagamentoAPI());
        assertDoesNotThrow(() -> novoProcessador.pagar(200.0));
    }

}