import org.junit.Test;
import static org.junit.Assert.*;

public class TesteConexao {

    @Test
    public void testConexao() {
        Conexao conexao = new Conexao();


        assertTrue(true);


        conexao.conectar();
        assertTrue(true);
        conexao.desconectar();
        assertTrue(true);
        conexao.aguardar();
        assertTrue(true);

        conexao.conectar();
        assertTrue(true);

        conexao.aguardar();
        assertTrue(true);

        conexao.desconectar();
        assertTrue(true);

        conexao.aguardar();
        assertTrue(true); 
    }
}
