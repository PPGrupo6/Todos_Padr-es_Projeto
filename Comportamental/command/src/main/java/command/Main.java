package command;

public class Main {
    public static void main(String[] args) {
        // Criando o receiver (cozinha)
        CozinhaReceiver cozinha = new CozinhaReceiver();

        // Criando os comandos (pedidos)
        Command pedidoPizza = new PedidoPizzaCommand(cozinha);
        Command pedidoHamburguer = new PedidoHamburguerCommand(cozinha);

        // Criando o invoker (garçom)
        GarcomInvoker garcom = new GarcomInvoker();

        // Garçom recebe e envia os pedidos
        garcom.setCommand(pedidoPizza);
        garcom.enviarPedido();

        garcom.setCommand(pedidoHamburguer);
        garcom.enviarPedido();
    }
}
