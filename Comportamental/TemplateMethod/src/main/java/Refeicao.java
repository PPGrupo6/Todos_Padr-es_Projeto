// Refeicao.java

// Classe abstrata que define o Template Method
public abstract class Refeicao {

    // Método Template Method que define o processo de preparação da refeição
    public final void prepararRefeicao() {
        prepararIngredientes();
        cozinhar();
        servir();
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    protected abstract void cozinhar();
    protected abstract void servir();

    // Método comum implementado na classe abstrata
    private void prepararIngredientes() {
        System.out.println("Preparando ingredientes comuns");
    }
}
