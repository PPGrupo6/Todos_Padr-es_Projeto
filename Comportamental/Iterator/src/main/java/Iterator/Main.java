package Iterator;

import Iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        NomeCollection collection = new NomeCollection();
        collection.addNome("Alice");
        collection.addNome("Bob");
        collection.addNome("Charlie");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String nome = (String) iterator.next();
            System.out.println("Nome: " + nome);
        }
    }
}