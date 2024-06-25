public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        GestorMementos gestor = new GestorMementos();

        // Altera o conteúdo do editor
        editor.setConteudo("Primeiro conteúdo");
        // Salva o estado atual
        gestor.adicionarMemento(editor.salvar());

        // Altera o conteúdo novamente
        editor.setConteudo("Segundo conteúdo");
        // Salva o estado atual
        gestor.adicionarMemento(editor.salvar());

        // Restaura o estado anterior
        Memento memento = gestor.getUltimoMemento();
        editor.restaurar(memento);

        System.out.println("Conteúdo atual do editor: " + editor.getConteudo());
    }
}
