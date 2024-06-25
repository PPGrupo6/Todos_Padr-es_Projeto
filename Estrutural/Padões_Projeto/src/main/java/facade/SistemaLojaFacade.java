package facade;

public class SistemaLojaFacade {
    private final Estoque estoque;
    private final Financeiro financeiro;
    private final Logistica logistica;

    public SistemaLojaFacade() {
        this.estoque = new Estoque();
        this.financeiro = new Financeiro();
        this.logistica = new Logistica();
    }

    public void criarPedido(String idPedido) {
        Pedido pedido = new Pedido(idPedido);
        estoque.reservarItem(pedido);
        financeiro.processarPagamento(pedido);
        logistica.enviarPedido(pedido);
        System.out.println("Pedido criado: " + pedido.getId() + " - Status: " + pedido.getStatus());
    }

    public void cancelarPedido(String idPedido) {
        Pedido pedido = new Pedido(idPedido);
        logistica.cancelarEnvio(pedido);
        financeiro.estornarPagamento(pedido);
        estoque.liberarItem(pedido);
        pedido.setStatus("Cancelado");
        System.out.println("Pedido cancelado: " + pedido.getId() + " - Status: " + pedido.getStatus());
    }
}
