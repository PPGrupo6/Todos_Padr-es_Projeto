import org.junit.Test;
import static org.junit.Assert.*;

public class ImpostoTest {

    @Test
    public void testImpostoBrasil() {
        ImpostoStrategy impostoBrasil = new ImpostoBrasil();
        assertEquals(20.0, impostoBrasil.calcularImposto(100.0), 0.001); // Imposto de 20% sobre 100
    }

    @Test
    public void testImpostoEUA() {
        ImpostoStrategy impostoEUA = new ImpostoEUA();
        assertEquals(10.0, impostoEUA.calcularImposto(100.0), 0.001); // Imposto de 10% sobre 100
    }

    @Test
    public void testImpostoCanada() {
        ImpostoStrategy impostoCanada = new ImpostoCanada();
        assertEquals(15.0, impostoCanada.calcularImposto(100.0), 0.001); // Imposto de 15% sobre 100
    }
}
