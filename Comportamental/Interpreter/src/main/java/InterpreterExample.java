// Exemplo de uso
public class InterpreterExample {
    public static void main(String[] args) {
        // Representando a expressão 2 + 3
        Expression expr1 = new AddExpression(new NumberExpression(2), new NumberExpression(3));
        System.out.println("2 + 3 = " + expr1.interpret()); // Saída: 2 + 3 = 5

        // Representando a expressão 4 - 1
        Expression expr2 = new SubtractExpression(new NumberExpression(4), new NumberExpression(1));
        System.out.println("4 - 1 = " + expr2.interpret()); // Saída: 4 - 1 = 3
    }
}
