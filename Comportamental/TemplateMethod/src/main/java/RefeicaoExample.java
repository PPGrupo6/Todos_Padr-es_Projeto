// RefeicaoExample.java

// Classe principal para testar o padrão Template Method
public class RefeicaoExample {

    public static void main(String[] args) {
        System.out.println("Preparando um prato de massa:");
        Refeicao massa = new Massa();
        massa.prepararRefeicao();

        System.out.println("\nPreparando um prato de carne:");
        Refeicao carne = new Carne();
        carne.prepararRefeicao();
    }
}
