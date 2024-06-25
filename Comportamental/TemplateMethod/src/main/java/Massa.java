// Massa.java

// Subclasse concreta para preparar um prato de massa
public class Massa extends Refeicao {

    @Override
    protected void cozinhar() {
        System.out.println("Cozinhando a massa");
    }

    @Override
    protected void servir() {
        System.out.println("Servindo o prato de massa");
    }
}
