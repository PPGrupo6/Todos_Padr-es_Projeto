package facade;

public class Pedido {
    private final String id;
    private String status;

    public Pedido(String id) {
        this.id = id;
        this.status = "Criado";
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

