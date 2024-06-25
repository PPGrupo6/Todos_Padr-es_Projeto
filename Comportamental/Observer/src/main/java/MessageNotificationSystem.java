import java.util.ArrayList;
import java.util.List;

// Classe que representa o sistema de notificações em um aplicativo de mensagens
public class MessageNotificationSystem {
    private List<Observer> observers = new ArrayList<>();

    // Método para adicionar observadores (usuários interessados em notificações)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Método para remover observadores (usuários que não desejam mais receber notificações)
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Método que simula o envio de uma nova mensagem, notificando todos os observadores
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
