public class ImpostoCanada implements ImpostoStrategy {
    @Override
    public double calcularImposto(double valor) {
        // Implementação do cálculo de imposto para o Canadá
        return valor * 0.15; // Imposto de 15%
    }
}
