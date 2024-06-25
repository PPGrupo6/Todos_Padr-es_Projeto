// Item Pesado
public class ItemPesado {
    private double peso;

    public ItemPesado(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    // Método para aceitar o visitor
    public void aceitar(Visitor visitor) {
        visitor.visitor(this);
    }
}
