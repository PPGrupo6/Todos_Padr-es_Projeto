package facade;

public class Logistica {
    public void enviarPedido(Pedido pedido) {
        System.out.println("Pedido enviado: " + pedido.getId());
    }

    public void cancelarEnvio(Pedido pedido) {
        System.out.println("Envio cancelado: " + pedido.getId());
    }
}
