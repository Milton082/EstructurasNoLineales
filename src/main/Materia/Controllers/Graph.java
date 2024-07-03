package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); // For undirected graphs, add edge in both directions
    }

    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("\nVertex " + node.getValue() + ":");
            for (NodeGraph neighbor : node.getNeighbors()) {
                System.out.print(" --> " + neighbor.getValue());
            }
        }
        System.out.println(); // Added to ensure the output ends with a newline
    }

    public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        visited[node.getValue()] = true;
        System.out.print(node.getValue() + " ");
        for (NodeGraph neighbor : node.getNeighbors()) {
            if (!visited[neighbor.getValue()]) {
                getDFSUtil(neighbor, visited);
            }
        }
    }

    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();
        visited[startNode.getValue()] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            NodeGraph node = queue.poll();
            System.out.print(node.getValue() + " ");
            for (NodeGraph neighbor : node.getNeighbors()) {
                if (!visited[neighbor.getValue()]) {
                    visited[neighbor.getValue()] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (NodeGraph neighbor : nodes.get(i).getNeighbors()) {
                adjacencyMatrix[i][neighbor.getValue()] = 1;
            }
        }
        return adjacencyMatrix;
    }

    public void printAdjacencyMatrix() {
        int[][] adjacencyMatrix = getAdjacencyMatrix();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
