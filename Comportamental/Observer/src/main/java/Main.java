public class Main {
    public static void main(String[] args) {
        // Criando o sistema de notificações
        MessageNotificationSystem notificationSystem = new MessageNotificationSystem();

        // Criando usuários (observadores)
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Registrando os usuários no sistema de notificações
        notificationSystem.addObserver(user1);
        notificationSystem.addObserver(user2);

        // Simulando o envio de uma nova mensagem
        notificationSystem.notifyObservers("Olá! Como vocês estão?");

        // Output esperado:
        // Usuário Alice recebeu uma nova mensagem: Olá! Como vocês estão?
        // Usuário Bob recebeu uma nova mensagem: Olá! Como vocês estão?
    }
}
