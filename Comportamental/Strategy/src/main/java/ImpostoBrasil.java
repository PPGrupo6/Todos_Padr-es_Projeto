// Implementações específicas das estratégias
public class ImpostoBrasil implements ImpostoStrategy {
    @Override
    public double calcularImposto(double valor) {
        // Implementação do cálculo de imposto para o Brasil
        return valor * 0.2; // Imposto de 20%
    }
}

