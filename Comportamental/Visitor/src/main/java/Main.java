// Classe principal para demonstrar o uso do padrão Visitor
public class Main {
    public static void main(String[] args) {
        ItemNormal itemNormal = new ItemNormal(5.0);   // peso de 5 kg
        ItemFragil itemFragil = new ItemFragil(3.0);   // peso de 3 kg
        ItemPesado itemPesado = new ItemPesado(10.0);  // peso de 10 kg

        CalculadoraCustoEnvio calculadora = new CalculadoraCustoEnvio();

        // Aceitando o visitor para calcular o custo de envio de cada item
        itemNormal.aceitar(calculadora);
        itemFragil.aceitar(calculadora);
        itemPesado.aceitar(calculadora);

        // Obtendo o custo total de envio calculado pelo visitor
        double custoTotalEnvio = calculadora.getCustoTotalEnvio();

        // Exibindo o resultado
        System.out.println("Custo total de envio: R$" + custoTotalEnvio);
    }
}
