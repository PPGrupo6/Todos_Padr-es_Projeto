import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MessageNotificationSystemTest {
    private MessageNotificationSystem notificationSystem;
    private User user1;
    private User user2;

    @Before
    public void setUp() {
      
        notificationSystem = new MessageNotificationSystem();
        user1 = new User("Alice");
        user2 = new User("Bob");


        notificationSystem.addObserver(user1);
        notificationSystem.addObserver(user2);
    }

    @Test
    public void testNotifyObservers() {

        String message = "Nova mensagem de teste!";
        notificationSystem.notifyObservers(message);


        assertTrue(user1.hasReceivedMessage(message));
        assertTrue(user2.hasReceivedMessage(message));
    }

    @Test
    public void testRemoveObserver() {
        // Remove um observador (usuário)
        notificationSystem.removeObserver(user1);

        // Simula o envio de uma nova mensagem após a remoção
        String message = "Outra mensagem de teste!";
        notificationSystem.notifyObservers(message);

        // Verifica se o usuário removido não recebeu a nova mensagem
        assertFalse(user1.hasReceivedMessage(message));
        assertTrue(user2.hasReceivedMessage(message)); // user2 ainda deve receber
    }
}
