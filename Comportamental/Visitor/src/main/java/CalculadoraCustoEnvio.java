// Visitor concreto para calcular custo de envio para cada tipo de item
public class CalculadoraCustoEnvio implements Visitor {
    private double custoTotalEnvio;

    public double getCustoTotalEnvio() {
        return custoTotalEnvio;
    }

    @Override
    public void visitor(ItemNormal item) {
        // Exemplo de cálculo de custo de envio para ItemNormal
        custoTotalEnvio += item.getPeso() * 1.0; // Custo base de $1 por kg
    }

    @Override
    public void visitor(ItemFragil item) {
        // Exemplo de cálculo de custo de envio para ItemFragil
        custoTotalEnvio += item.getPeso() * 1.5; // Custo base de $1.5 por kg para itens frágeis
    }

    @Override
    public void visitor(ItemPesado item) {
        // Exemplo de cálculo de custo de envio para ItemPesado
        custoTotalEnvio += item.getPeso() * 2.0; // Custo base de $2 por kg para itens pesados
    }
}
