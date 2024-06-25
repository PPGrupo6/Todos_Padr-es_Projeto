// Item Normal
public class ItemNormal {
    private double peso;

    public ItemNormal(double peso) {
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
