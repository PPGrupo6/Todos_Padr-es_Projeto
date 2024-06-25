package command;

// Concrete Command 1: Pedido de Pizza
public class PedidoPizzaCommand implements Command {
    private CozinhaReceiver receiver;

    public PedidoPizzaCommand(CozinhaReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.prepararPizza();
    }
}

