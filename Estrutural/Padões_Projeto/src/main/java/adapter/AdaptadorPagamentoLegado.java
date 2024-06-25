package adapter;

public class AdaptadorPagamentoLegado implements ProcessadorPagamento {
    private final PagamentoLegadoAPI pagamentoLegadoAPI;

    public AdaptadorPagamentoLegado(PagamentoLegadoAPI pagamentoLegadoAPI) {
        this.pagamentoLegadoAPI = pagamentoLegadoAPI;
    }

    @Override
    public void pagar(double valor) {
        pagamentoLegadoAPI.fazerPagamento(valor);
    }
}
