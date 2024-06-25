package decorator;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String descricao() {
        return cafe.descricao();
    }

    @Override
    public double preco() {
        return cafe.preco();
    }
}
