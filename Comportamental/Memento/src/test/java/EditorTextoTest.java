import org.junit.Test;
import static org.junit.Assert.*;

public class EditorTextoTest {

    @Test
    public void testEditorTexto() {

        EditorTexto editor = new EditorTexto();
        GestorMementos gestor = new GestorMementos();

        editor.setConteudo("Primeiro conteúdo");
        gestor.adicionarMemento(editor.salvar());

        assertEquals("Primeiro conteúdo", editor.getConteudo());
        editor.setConteudo("Segundo conteúdo");

        gestor.adicionarMemento(editor.salvar());
        
        assertEquals("Segundo conteúdo", editor.getConteudo());

    }
}
