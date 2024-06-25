// Estado Desconectado
public class DesconectadoState implements ConnectionState {
    @Override
    public void conectar() {
        System.out.println("Conectando...");
        // Transição de estado para Conectado
        // context.setState(new ConectadoState());
    }

    @Override
    public void desconectar() {
        System.out.println("Já está desconectado.");
    }

    @Override
    public void aguardar() {
        System.out.println("Aguardando...");
        // Transição de estado para Aguardando
        // context.setState(new AguardandoState());
    }
}
