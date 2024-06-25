// Estado Conectado
public class ConectadoState implements ConnectionState {
    @Override
    public void conectar() {
        System.out.println("Já está conectado.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
        // Transição de estado para Desconectado
        // context.setState(new DesconectadoState());
    }

    @Override
    public void aguardar() {
        System.out.println("Aguardando...");
        // Transição de estado para Aguardando
        // context.setState(new AguardandoState());
    }
}

