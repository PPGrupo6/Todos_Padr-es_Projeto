package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest {

    @Test
    public void testCafeSimples() {
        Cafe cafe = new CafeSimples();
        assertEquals("Café simples", cafe.descricao());
        assertEquals(2.0, cafe.preco(), 0.01);
    }

    @Test
    public void testCafeComLeite() {
        Cafe cafe = new Leite(new CafeSimples());
        assertEquals("Café simples, com leite", cafe.descricao());
        assertEquals(2.5, cafe.preco(), 0.01);
    }

    @Test
    public void testCafeComAcucar() {
        Cafe cafe = new Acucar(new CafeSimples());
        assertEquals("Café simples, com açúcar", cafe.descricao());
        assertEquals(2.2, cafe.preco(), 0.01);
    }

    @Test
    public void testCafeComLeiteEAcucar() {
        Cafe cafe = new Acucar(new Leite(new CafeSimples()));
        assertEquals("Café simples, com leite, com açúcar", cafe.descricao());
        assertEquals(2.7, cafe.preco(), 0.01);
    }

    @Test
    public void testCafeDecorator() {
        Cafe cafeDecorado = new CafeDecorator(new Cafe() {
            @Override
            public String descricao() {
                return "Café decorado";
            }
            @Override
            public double preco() {
                return 3.0;
            }
        }) {};

        assertEquals("Café decorado", cafeDecorado.descricao());
        assertEquals(3.0, cafeDecorado.preco(), 0.01);
    }

}

