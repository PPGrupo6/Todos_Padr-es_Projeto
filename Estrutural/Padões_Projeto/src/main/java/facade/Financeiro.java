package facade;

public class Financeiro {
    public void processarPagamento(Pedido pedido) {
        System.out.println("Pagamento processado para o pedido: " + pedido.getId());
    }

    public void estornarPagamento(Pedido pedido) {
        System.out.println("Pagamento estornado para o pedido: " + pedido.getId());
    }
}
