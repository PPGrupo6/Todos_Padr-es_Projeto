import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatRoomTest {

    private ChatRoom salaDeChat;
    private User usuario1;
    private User usuario2;
    private User usuario3;

    @BeforeEach
    public void setUp() {
        salaDeChat = new ChatRoom();
        usuario1 = new User("Alice", salaDeChat);
        usuario2 = new User("Bob", salaDeChat);
        usuario3 = new User("Charlie", salaDeChat);

        salaDeChat.addUser(usuario1);
        salaDeChat.addUser(usuario2);
        salaDeChat.addUser(usuario3);
    }

    @Test
    public void testEnviarMensagem() {
        // Enviamos uma mensagem de Alice para os outros usuários
        salaDeChat.sendMessage("Olá pessoal!", usuario1);

        // Verificamos se Bob e Charlie receberam a mensagem
        assertTrue(usuario2.recebeuMensagem("Olá pessoal!"));
        assertTrue(usuario3.recebeuMensagem("Olá pessoal!"));
    }
}
