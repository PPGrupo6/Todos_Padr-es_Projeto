package decorator;

public class CafeSimples implements Cafe {
    @Override
    public String descricao() {
        return "Café simples";
    }

    @Override
    public double preco() {
        return 2.0;
    }
}
