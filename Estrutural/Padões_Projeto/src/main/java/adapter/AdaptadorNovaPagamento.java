package adapter;

public class AdaptadorNovaPagamento implements ProcessadorPagamento {
    private final NovaPagamentoAPI novaPagamentoAPI;

    public AdaptadorNovaPagamento(NovaPagamentoAPI novaPagamentoAPI) {
        this.novaPagamentoAPI = novaPagamentoAPI;
    }

    @Override
    public void pagar(double valor) {
        novaPagamentoAPI.processarPagamento(valor);
    }
}
