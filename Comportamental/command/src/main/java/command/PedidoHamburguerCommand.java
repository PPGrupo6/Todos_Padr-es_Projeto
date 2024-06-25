package command;

// Concrete Command 2: Pedido de Hambúrguer
public class PedidoHamburguerCommand implements Command {
    private CozinhaReceiver receiver;

    public PedidoHamburguerCommand(CozinhaReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.prepararHamburguer();
    }
}
