public class Main {
    public static void main(String[] args) {
        // Criando uma calculadora com a estratégia de imposto do Brasil
        CalculadoraImposto calcBrasil = new CalculadoraImposto(new ImpostoBrasil());
        double impostoBrasil = calcBrasil.calcularImposto(100.0);
        System.out.println("Imposto no Brasil: " + impostoBrasil);

        // Criando uma calculadora com a estratégia de imposto dos EUA
        CalculadoraImposto calcEUA = new CalculadoraImposto(new ImpostoEUA());
        double impostoEUA = calcEUA.calcularImposto(100.0);
        System.out.println("Imposto nos EUA: " + impostoEUA);

        // Criando uma calculadora com a estratégia de imposto do Canadá
        CalculadoraImposto calcCanada = new CalculadoraImposto(new ImpostoCanada());
        double impostoCanada = calcCanada.calcularImposto(100.0);
        System.out.println("Imposto no Canadá: " + impostoCanada);
    }
}
