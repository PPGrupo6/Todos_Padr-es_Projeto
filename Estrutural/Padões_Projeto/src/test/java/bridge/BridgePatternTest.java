package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BridgePatternTest {

    @Test
    public void testTV() {
        Dispositivo tv = new TV();
        assertFalse(tv.isLigado());
        tv.ligar();
        assertTrue(tv.isLigado());
        tv.setVolume(50);
        assertEquals(50, tv.getVolume());
        tv.setCanal(10);
        assertEquals(10, tv.getCanal());
        tv.desligar();
        assertFalse(tv.isLigado());
    }

    @Test
    public void testRadio() {
        Dispositivo radio = new Radio();
        assertFalse(radio.isLigado());
        radio.ligar();
        assertTrue(radio.isLigado());
        radio.setVolume(30);
        assertEquals(30, radio.getVolume());
        radio.setCanal(5);
        assertEquals(5, radio.getCanal());
        radio.desligar();
        assertFalse(radio.isLigado());
    }

    @Test
    public void testControleRemotoSimplesTV() {
        Dispositivo tv = new TV();
        Controle controleSimples = new ControleRemotoSimples(tv);
        controleSimples.ligarDesligar();
        assertTrue(tv.isLigado());
        controleSimples.aumentarVolume();
        assertEquals(40, tv.getVolume());
        controleSimples.diminuirVolume();
        assertEquals(30, tv.getVolume());
        controleSimples.ligarDesligar();
        assertFalse(tv.isLigado());
    }

    @Test
    public void testControleRemotoAvancadoRadio() {
        Dispositivo radio = new Radio();
        Controle controleAvancado = new ControleRemotoAvancado(radio);
        controleAvancado.ligarDesligar();
        assertTrue(radio.isLigado());
        controleAvancado.aumentarVolume();
        assertEquals(60, radio.getVolume());
        controleAvancado.diminuirVolume();
        assertEquals(50, radio.getVolume());
        ((ControleRemotoAvancado) controleAvancado).mudarCanal(3);
        assertEquals(3, radio.getCanal());
        controleAvancado.ligarDesligar();
        assertFalse(radio.isLigado());
    }
}