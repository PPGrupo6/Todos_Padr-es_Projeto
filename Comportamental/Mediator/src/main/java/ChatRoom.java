import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> usuarios;

    public ChatRoom() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void sendMessage(String mensagem, User usuario) {
        for (User u : usuarios) {
            if (u != usuario) {
                u.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void addUser(User usuario) {
        usuarios.add(usuario);
    }
}
