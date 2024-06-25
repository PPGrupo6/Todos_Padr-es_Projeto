package ChainOfResponsability;


public class AccessControlExample {
    public static void main(String[] args) {
        // Configuração da cadeia de responsabilidade
        AccessHandler basicHandler = new BasicAccessHandler();
        AccessHandler intermediateHandler = new IntermediateAccessHandler(new AdvancedAccessHandler());

        // Simulação de solicitações de acesso
        checkAccess(basicHandler, 1);
        checkAccess(intermediateHandler, 2);
        checkAccess(intermediateHandler, 3);
    }

    private static void checkAccess(AccessHandler handler, int level) {
        if (handler.checkAccess(level)) {
            System.out.println("Acesso permitido para o nível " + level);
        } else {
            System.out.println("Acesso negado para o nível " + level);
        }
    }
}
