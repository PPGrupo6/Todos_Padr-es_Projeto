package decorator;

public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descricao() {
        return cafe.descricao() + ", com leite";
    }

    @Override
    public double preco() {
        return cafe.preco() + 0.5;
    }
}
