import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraImpostoTest {

    @Test
    public void testCalculoImpostoBrasil() {
        CalculadoraImposto calcBrasil = new CalculadoraImposto(new ImpostoBrasil());
        assertEquals(20.0, calcBrasil.calcularImposto(100.0), 0.001); // Imposto de 20% sobre 100
    }

    @Test
    public void testCalculoImpostoEUA() {
        CalculadoraImposto calcEUA = new CalculadoraImposto(new ImpostoEUA());
        assertEquals(10.0, calcEUA.calcularImposto(100.0), 0.001); // Imposto de 10% sobre 100
    }

    @Test
    public void testCalculoImpostoCanada() {
        CalculadoraImposto calcCanada = new CalculadoraImposto(new ImpostoCanada());
        assertEquals(15.0, calcCanada.calcularImposto(100.0), 0.001); // Imposto de 15% sobre 100
    }
}
