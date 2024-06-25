package proxy;

import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    public void testProxyRedeSocial() {
        RedeSocial redeSocial = new ServidorRedeSocialProxy("Alice");

        // Alice deve acessar através do proxy pela primeira vez
        redeSocial.acessar("Alice");

        // Alice já está conectada, então deve acessar diretamente
        redeSocial.acessar("Alice");
    }

}
