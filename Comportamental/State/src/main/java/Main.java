public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        conexao.conectar();
        conexao.aguardar();
        conexao.desconectar();
        conexao.aguardar();
        conexao.conectar();
    }
}
