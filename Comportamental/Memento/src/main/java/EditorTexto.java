// EditorTexto.java
public class EditorTexto {
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Memento salvar() {
        return new Memento(conteudo);
    }

    public void restaurar(Memento memento) {
        this.conteudo = memento.getEstadoSalvo();
    }
}
