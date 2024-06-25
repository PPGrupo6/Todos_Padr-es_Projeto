
// Interface que define os métodos que todos os estados devem implementar
public interface ConnectionState {
    void conectar();
    void desconectar();
    void aguardar();
}

