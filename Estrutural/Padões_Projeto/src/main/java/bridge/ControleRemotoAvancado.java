package bridge;

public class ControleRemotoAvancado extends Controle {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDesligar() {
        if (dispositivo.isLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    @Override
    public void aumentarVolume() {
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void diminuirVolume() {
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    public void mudarCanal(int canal) {
        dispositivo.setCanal(canal);
    }
}