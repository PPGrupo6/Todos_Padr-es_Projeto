package command;

// Invoker: Garçom que invoca os comandos
public class GarcomInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void enviarPedido() {
        System.out.println("Garçom enviando o pedido...");
        command.execute();
    }
}
