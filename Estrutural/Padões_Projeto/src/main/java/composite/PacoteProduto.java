package composite;

import java.util.ArrayList;
import java.util.List;

public class PacoteProduto implements Componente {
    private final List<Componente> produtos = new ArrayList<>();

    public void adicionarProduto(Componente produto) {
        produtos.add(produto);
    }

    public void removerProduto(Componente produto) {
        produtos.remove(produto);
    }

    @Override
    public double calcularPreco() {
        double precoTotal = 0;
        for (Componente produto : produtos) {
            precoTotal += produto.calcularPreco();
        }
        return precoTotal;
    }
}
