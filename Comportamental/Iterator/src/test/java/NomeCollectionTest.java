import static org.junit.Assert.*;

import Iterator.Iterator;
import Iterator.NomeCollection;
import org.junit.Before;
import org.junit.Test;
import Iterator.NomeCollection;
import Iterator.Iterator;

public class NomeCollectionTest {

    private NomeCollection collection;

    @Before
    public void setUp() {
        collection = new NomeCollection();
        collection.addNome("Alice");
        collection.addNome("Bob");
        collection.addNome("Charlie");
    }

    @Test
    public void testIteratorHasNext() {
        Iterator iterator = collection.iterator();
        assertTrue(iterator.hasNext());
        iterator.next(); // "Alice"
        assertTrue(iterator.hasNext());
        iterator.next(); // "Bob"
        assertTrue(iterator.hasNext());
        iterator.next(); // "Charlie"
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNext() {
        Iterator iterator = collection.iterator();
        assertEquals("Alice", iterator.next());
        assertEquals("Bob", iterator.next());
        assertEquals("Charlie", iterator.next());
    }

    @Test
    public void testEmptyCollection() {
        NomeCollection emptyCollection = new NomeCollection();
        Iterator iterator = emptyCollection.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSingleElementCollection() {
        NomeCollection singleElementCollection = new NomeCollection();
        singleElementCollection.addNome("Alice");
        Iterator iterator = singleElementCollection.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Alice", iterator.next());
        assertFalse(iterator.hasNext());
    }
}
