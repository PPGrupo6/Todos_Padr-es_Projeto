package bridge;

public abstract class Controle {
    protected Dispositivo dispositivo;

    public Controle(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligarDesligar();

    public abstract void aumentarVolume();

    public abstract void diminuirVolume();
}

