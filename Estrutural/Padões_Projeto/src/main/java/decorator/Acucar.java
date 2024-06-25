package decorator;

public class Acucar extends CafeDecorator {
    public Acucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descricao() {
        return cafe.descricao() + ", com açúcar";
    }

    @Override
    public double preco() {
        return cafe.preco() + 0.2;
    }
}
