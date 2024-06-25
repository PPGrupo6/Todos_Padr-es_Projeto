import ChainOfResponsability.AccessHandler;
import ChainOfResponsability.AdvancedAccessHandler;
import ChainOfResponsability.BasicAccessHandler;
import ChainOfResponsability.IntermediateAccessHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccessHandlerTest {

    @Test
    public void testBasicAccessHandler() {
        AccessHandler basicHandler = new BasicAccessHandler();

        assertTrue(basicHandler.checkAccess(1));
        assertFalse(basicHandler.checkAccess(2));
        assertFalse(basicHandler.checkAccess(3));
    }

    @Test
    public void testIntermediateAccessHandler() {
        AccessHandler intermediateHandler = new IntermediateAccessHandler(new AdvancedAccessHandler());

        assertFalse(intermediateHandler.checkAccess(1));
        assertTrue(intermediateHandler.checkAccess(2));
        assertTrue(intermediateHandler.checkAccess(3));
    }

    @Test
    public void testAdvancedAccessHandler() {
        AccessHandler advancedHandler = new AdvancedAccessHandler();

        assertFalse(advancedHandler.checkAccess(1));
        assertFalse(advancedHandler.checkAccess(2));
        assertTrue(advancedHandler.checkAccess(3));
    }
}
