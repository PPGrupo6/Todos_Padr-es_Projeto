// Classe que utiliza o padrão Strategy
public class CalculadoraImposto {
    private ImpostoStrategy estrategia;

    public CalculadoraImposto(ImpostoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularImposto(double valorProduto) {
        return estrategia.calcularImposto(valorProduto);
    }
}
