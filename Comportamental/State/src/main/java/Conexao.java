// Classe que mantém o estado atual e delega as operações para o estado atual
public class Conexao {
    private ConnectionState estadoAtual;

    public Conexao() {
        // Inicializa com o estado Desconectado
        this.estadoAtual = new DesconectadoState();
    }

    public void setEstadoAtual(ConnectionState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void conectar() {
        estadoAtual.conectar();
    }

    public void desconectar() {
        estadoAtual.desconectar();
    }

    public void aguardar() {
        estadoAtual.aguardar();
    }
}
