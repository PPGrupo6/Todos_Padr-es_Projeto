package Iterator;

import Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NomeCollection {
    private List<String> nomes = new ArrayList<>();

    public void addNome(String nome) {
        nomes.add(nome);
    }

    public Iterator iterator() {
        return new NomeIterator();
    }

    private class NomeIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < nomes.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return nomes.get(index++);
            }
            return null;
        }
    }
}
