package main.Materia.Controllers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SetsClase {
    public SetsClase() {
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConConparador();
    }

    public void construirHashSet() {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        conjunto.add("Manzana");
        System.out.println("HashSet: " + conjunto);
        conjunto.remove("Banana");
        System.out.println("HashSet despues de remover Banana " + conjunto);
        conjunto.remove("Uvas");
        conjunto.remove("Piña");
        System.out.println("\"HashSet despues de remover Uvas y Piña" + conjunto);
        Boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("HashSet contiene Naranja ? " + conjunto);
        int tamaño = conjunto.size();
        System.out.println("Tamaño del HashSet: " + tamaño);

    }

    public void construirLinkedHashSet() {
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        conjunto.add("Manzana");
        // Agregar elementos
        System.out.println("\nLinkedHashSet: " + conjunto);
    }

    public void construirTreeSetConConparador() {
        Comparator<String> comparatorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }

        };
        TreeSet<String> conjunto = new TreeSet<>(comparatorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        conjunto.add("Manzana");
        // Agregar elementos
        System.out.println("\nTreeSetConConparador: " + conjunto);

    }

    public void construirTreeSet() {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        conjunto.add("Manzana");
        // Agregar elementos
        System.out.println("\nTreeSet: " + conjunto);
    }

}