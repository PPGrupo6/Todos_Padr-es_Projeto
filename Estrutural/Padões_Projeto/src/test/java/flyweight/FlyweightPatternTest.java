package flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightPatternTest {

    private FormaFactory fabrica;

    @BeforeEach
    public void setUp() {
        fabrica = new FormaFactory();
    }

    @Test
    public void testGetCirculoExistente() {
        Circulo circulo1 = (Circulo) fabrica.getCirculo("Vermelho");
        Circulo circulo2 = (Circulo) fabrica.getCirculo("Vermelho");

        assertSame(circulo1, circulo2);
    }

    @Test
    public void testCirculoCor() {
        Circulo circulo = (Circulo) fabrica.getCirculo("Verde");
        assertEquals("Verde", circulo.getCor());
    }

    @Test
    public void testCirculoCoordenadas() {
        Circulo circulo = (Circulo) fabrica.getCirculo("Preto");
        circulo.setX(10);
        circulo.setY(20);
        circulo.setRaio(30);

        assertEquals(10, circulo.getX());
        assertEquals(20, circulo.getY());
        assertEquals(30, circulo.getRaio());
    }

    @Test
    public void testDesenhar() {
        // Redireciona a saída padrão para capturar o que seria impresso no console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Cria um círculo com valores específicos
        Circulo circulo = new Circulo("Amarelo");
        circulo.setX(50);
        circulo.setY(70);
        circulo.setRaio(20);

        // Chama o método desenhar()
        circulo.desenhar();

        // Restaura a saída padrão
        System.setOut(System.out);

        // Captura a saída do método desenhar()
        String output = outputStream.toString().trim();

        // Verifica se a saída contém as informações esperadas
        assertTrue(output.contains("Círculo: Desenhar() [Cor: Amarelo, x: 50, y:70, raio:20]"));
    }

}
