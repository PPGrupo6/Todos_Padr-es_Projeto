package composite;

public class Produto implements Componente {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}
