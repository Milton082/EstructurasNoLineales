package main;

import main.Materia.Controllers.Graph;
import main.Materia.Controllers.SetsClase;
import main.Materia.Models.NodeGraph;

public class App {

    public static void main(String[] args) throws Exception {
        /*
         * ArbolBinario arbolBinario = new ArbolBinario();
         * Node nodeRoot = new Node(1);
         * nodeRoot.setLeft(new Node(2));
         * nodeRoot.setRight(new Node(3));
         * 
         * nodeRoot.getLeft().setLeft(new Node(4));
         * nodeRoot.getLeft().setRight(new Node(5));
         * 
         * nodeRoot.getRight().setLeft(new Node(6));
         * nodeRoot.getLeft().getLeft().setLeft(new Node(7));
         * nodeRoot.getLeft().getRight().setLeft(new Node(8));
         * System.out.println("\nPreOrder - Loop");
         * arbolBinario.preOrderLoop(nodeRoot);
         * System.out.println(" \nPreOrder - Recursivo");
         * arbolBinario.preOrderRecursivo(nodeRoot);
         * System.out.println();
         * System.out.println("PostOrder - Loop");
         * arbolBinario.postOrderLoop(nodeRoot);
         * System.out.println("\n PostOrder - Recursivo");
         * arbolBinario.postOrderRecursivo(nodeRoot);
         * System.out.println("\n PostOrder - InRecursivo");
         * arbolBinario.inRecursivo(nodeRoot);
         * 
         * AVLTree tree = new AVLTree();
         * 
         * int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};
         * 
         * for (int value : values) {
         * tree.insert(value);
         * 
         * }
         */
        //runGraph();
        runSets();

    }

    /*
     * private static void runGraph() {
     * Graph graph = new Graph();
     * 
     * // NodeGraph node1 = new NodeGraph(1);
     * // NodeGraph node2 = new NodeGraph(2);
     * // NodeGraph node3 = new NodeGraph(3);
     * // NodeGraph node4 = new NodeGraph(4);
     * // NodeGraph node5 = new NodeGraph(5);
     * NodeGraph node1 = graph.addNode(1);
     * NodeGraph node2 = graph.addNode(2);
     * NodeGraph node3 = graph.addNode(3);
     * NodeGraph node4 = graph.addNode(4);
     * NodeGraph node5 = graph.addNode(5);
     * 
     * graph.addEdge(node1, node2);
     * graph.addEdge(node1, node3);
     * graph.addEdge(node2, node4);
     * graph.addEdge(node4, node5);
     * graph.printGraph();
     * 
     * }
     */
    private static void runSets() {
        new SetsClase();
    }
}
