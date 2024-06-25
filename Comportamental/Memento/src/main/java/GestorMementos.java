// GestorMementos.java
import java.util.Stack;

public class GestorMementos {
    private Stack<Memento> mementos = new Stack<>();

    public void adicionarMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getUltimoMemento() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
