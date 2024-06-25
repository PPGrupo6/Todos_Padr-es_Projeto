// Estado Aguardando
public class AguardandoState implements ConnectionState {
    @Override
    public void conectar() {
        System.out.println("Aguardando... não pode conectar agora.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
        // Transição de estado para Desconectado
        // context.setState(new DesconectadoState());
    }

    @Override
    public void aguardar() {
        System.out.println("Já está aguardando.");
    }
}
