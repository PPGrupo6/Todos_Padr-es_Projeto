package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositePatternTest {

    @Test
    public void testCalcularPrecoProdutoIndividual() {
        Componente produto1 = new Produto("Camiseta", 50.0);
        assertEquals(50.0, produto1.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoPacoteProduto() {
        Componente produto1 = new Produto("Camiseta", 50.0);
        Componente produto2 = new Produto("Calça", 80.0);

        PacoteProduto pacote = new PacoteProduto();
        pacote.adicionarProduto(produto1);
        pacote.adicionarProduto(produto2);

        assertEquals(130.0, pacote.calcularPreco(), 0.001);
    }

    @Test
    public void testRemoverProdutoDoPacote() {
        Componente produto1 = new Produto("Camiseta", 50.0);
        Componente produto2 = new Produto("Calça", 80.0);

        PacoteProduto pacote = new PacoteProduto();
        pacote.adicionarProduto(produto1);
        pacote.adicionarProduto(produto2);

        assertEquals(130.0, pacote.calcularPreco(), 0.001);

        pacote.removerProduto(produto1); // Removendo a camiseta do pacote

        assertEquals(80.0, pacote.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoPacoteProdutoComProdutosEOutroPacote() {
        Componente produto1 = new Produto("Camiseta", 50.0);
        Componente produto2 = new Produto("Calça", 80.0);

        PacoteProduto pacote1 = new PacoteProduto();
        pacote1.adicionarProduto(produto1);

        PacoteProduto pacote2 = new PacoteProduto();
        pacote2.adicionarProduto(produto2);
        pacote2.adicionarProduto(pacote1);

        assertEquals(130.0, pacote2.calcularPreco(), 0.001);

        pacote2.removerProduto(pacote1); // Removendo o pacote1 (que contém a camiseta)

        assertEquals(80.0, pacote2.calcularPreco(), 0.001);
    }

    @Test
    public void testGetNomeProduto() {
        Produto produto = new Produto("Sapato", 120.0);
        assertEquals("Sapato", produto.getNome());
    }

}
