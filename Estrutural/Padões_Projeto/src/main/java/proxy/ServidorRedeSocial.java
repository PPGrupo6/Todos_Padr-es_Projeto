package proxy;

public class ServidorRedeSocial implements RedeSocial {
    @Override
    public void acessar(String usuario) {
        System.out.println(usuario + " acessando a rede social diretamente.");
    }
}
