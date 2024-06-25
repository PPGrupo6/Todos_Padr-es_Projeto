public class User {
    private String nome;
    private ChatRoom salaDeChat;
    private boolean receiveMessage; // Alterei o nome da variável de receivesMessage para receiveMessage

    public User(String nome, ChatRoom salaDeChat) {
        this.nome = nome;
        this.salaDeChat = salaDeChat;
    }

    public void enviarMensagem(String mensagem) {
        salaDeChat.sendMessage(mensagem, this);
    }

    public boolean recebeuMensagem(String mensagem) {
        return receiveMessage;
    }

    public void receberMensagem(String mensagem) {
        receiveMessage = true;
    }
}
