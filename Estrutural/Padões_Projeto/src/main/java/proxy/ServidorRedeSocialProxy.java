package proxy;

public class ServidorRedeSocialProxy implements RedeSocial {
    private ServidorRedeSocial servidorReal;
    private String usuario;

    public ServidorRedeSocialProxy(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void acessar(String usuario) {
        if (servidorReal == null) {
            servidorReal = new ServidorRedeSocial();
        }
        servidorReal.acessar(usuario);
    }

}
