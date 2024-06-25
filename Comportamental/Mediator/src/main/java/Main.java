public class Main {
    public static void main(String[] args) {
        ChatMediator salaDeChat = new ChatRoom();

        User usuario1 = new User("Alice", (ChatRoom) salaDeChat);
        User usuario2 = new User("Bob", (ChatRoom) salaDeChat);
        User usuario3 = new User("Charlie", (ChatRoom) salaDeChat);

        salaDeChat.addUser(usuario1);
        salaDeChat.addUser(usuario2);
        salaDeChat.addUser(usuario3);

        usuario1.enviarMensagem("Olá pessoal!");
        usuario2.enviarMensagem("E aí Alice!");
    }
}
