import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculadoraCustoEnvio {

    @Test
    public void testarCalculoCustoEnvio() {

        ItemNormal itemNormal = new ItemNormal(5.0);   // peso de 5 kg
        ItemFragil itemFragil = new ItemFragil(3.0);   // peso de 3 kg
        ItemPesado itemPesado = new ItemPesado(10.0);  // peso de 10 kg


        CalculadoraCustoEnvio calculadora = new CalculadoraCustoEnvio();

      
        itemNormal.aceitar(calculadora);
        itemFragil.aceitar(calculadora);
        itemPesado.aceitar(calculadora);

        // Verificar se o custo total de envio foi calculado corretamente
        assertEquals(29.5, calculadora.getCustoTotalEnvio(), 0.001); // O terceiro parâmetro é a margem de erro permitida
    }
}
