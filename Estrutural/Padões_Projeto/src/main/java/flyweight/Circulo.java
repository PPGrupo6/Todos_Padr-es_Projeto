package flyweight;

public class Circulo implements Forma {
    private final String cor;
    private int x;
    private int y;
    private int raio;

    public Circulo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Círculo: Desenhar() [Cor: " + cor + ", x: " + x + ", y:" + y + ", raio:" + raio + "]");
    }
}

