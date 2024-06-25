package ChainOfResponsability;

// Manipulador concreto para acesso intermediário
public class IntermediateAccessHandler implements AccessHandler {
    private final AccessHandler nextHandler;

    public IntermediateAccessHandler(AccessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean checkAccess(int level) {
        if (level == 2) {
            System.out.println("Acesso concedido no nível Intermediário.");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.checkAccess(level);
        }
        return false;
    }
}
