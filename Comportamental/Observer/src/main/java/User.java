public class User implements Observer {
    private String username;
    private String receivedMessage; // Mensagem recebida

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        // Atualiza a mensagem recebida
        this.receivedMessage = message;
    }

    // Método para verificar se o usuário recebeu uma determinada mensagem
    public boolean hasReceivedMessage(String message) {
        return message.equals(receivedMessage);
    }
}
