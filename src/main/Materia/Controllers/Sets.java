package main.Materia.Controllers;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    // Constructor vacío
    public Sets() {
    }

    // Método para construir un HashSet
    public void construirHashSet() {
        HashSet<String> conjunto = new HashSet<>();
    }

    // Método para construir un LinkedHashSet
    public LinkedHashSet<Integer> construirLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    // Método para construir un TreeSet
    public TreeSet<Integer> construirTreeSet() {
        return new TreeSet<>();
    }

    // Método para construir un TreeSet con comparador
    public TreeSet<Integer> construirTreeSetConComparador(Comparator<Integer> comparador) {
        return new TreeSet<>(comparador);
    }
}


