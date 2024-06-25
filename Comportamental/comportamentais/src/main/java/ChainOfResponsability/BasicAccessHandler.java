package ChainOfResponsability;

// Implementação básica do manipulador
public class BasicAccessHandler implements AccessHandler {
    @Override
    public boolean checkAccess(int level) {
        if (level <= 1) {
            System.out.println("Acesso concedido no nível Básico.");
            return true;
        }
        return false;
    }
}
