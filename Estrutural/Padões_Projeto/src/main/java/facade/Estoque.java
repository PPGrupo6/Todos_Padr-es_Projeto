package facade;

public class Estoque {
    public void reservarItem(Pedido pedido) {
        System.out.println("Item reservado para o pedido: " + pedido.getId());
    }

    public void liberarItem(Pedido pedido) {
        System.out.println("Item liberado para o pedido: " + pedido.getId());
    }
}

