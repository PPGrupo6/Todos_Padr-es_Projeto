import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MassaTest {

    @Test
    public void testPrepararRefeicao() {
        // Redireciona a saída padrão para capturar o que é impresso no console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Executa o método prepararRefeicao() da classe Massa
        Refeicao massa = new Massa();
        massa.prepararRefeicao();

        // Restaura a saída padrão
        System.setOut(System.out);

    }
}
