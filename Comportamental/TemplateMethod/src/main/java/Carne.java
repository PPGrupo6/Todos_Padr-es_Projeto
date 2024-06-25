// Carne.java

// Subclasse concreta para preparar um prato de carne
public class Carne extends Refeicao {

    @Override
    protected void cozinhar() {
        System.out.println("Cozinhando a carne");
    }

    @Override
    protected void servir() {
        System.out.println("Servindo o prato de carne");
    }
}
