import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testMainOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        String[] args = {};
        Main.main(args);


        String output = outputStream.toString().trim();

        assertTrue(output.contains("Imposto no Brasil: 20.0"));
        assertTrue(output.contains("Imposto nos EUA: 10.0"));
        assertTrue(output.contains("Imposto no Canadá: 15.0"));
    }
}
