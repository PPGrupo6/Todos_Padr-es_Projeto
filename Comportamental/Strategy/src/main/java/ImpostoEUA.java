public class ImpostoEUA implements ImpostoStrategy {
    @Override
    public double calcularImposto(double valor) {
        // Implementação do cálculo de imposto para os EUA
        return valor * 0.1; // Imposto de 10%
    }
}
