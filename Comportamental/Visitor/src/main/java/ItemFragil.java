// Item Frágil
public class ItemFragil {
    private double peso;

    public ItemFragil(double peso) {
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
