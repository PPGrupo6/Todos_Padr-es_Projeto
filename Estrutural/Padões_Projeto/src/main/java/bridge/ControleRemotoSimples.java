package bridge;

public class ControleRemotoSimples extends Controle {

    public ControleRemotoSimples(Dispositivo dispositivo) {
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
}

