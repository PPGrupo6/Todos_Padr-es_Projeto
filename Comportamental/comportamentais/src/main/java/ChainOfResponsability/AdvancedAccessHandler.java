package ChainOfResponsability;

// Manipulador concreto para acesso avançado
public class AdvancedAccessHandler implements AccessHandler {
    @Override
    public boolean checkAccess(int level) {
        if (level >= 3) {
            System.out.println("Acesso concedido no nível Avançado.");
            return true;
        }
        return false;
    }
}
