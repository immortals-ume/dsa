package com.immortals.ds.graph;

import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}

public class GraphUsingList {
    List<Node> nodes;

    public GraphUsingList() {
        nodes = new ArrayList<>();
    }

    public static void main(String[] args) {
        GraphUsingList graph = new GraphUsingList();

        // Adding nodes
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        // Adding edges
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Printing the graph
        graph.printGraph();
    }

    public void addNode(int value) {
        nodes.add(new Node(value));
    }

    public void addEdge(int from, int to) {
        Node fromNode = findNode(from);
        Node toNode = findNode(to);

        if (fromNode != null && toNode != null) {
            fromNode.neighbors.add(toNode);
            // For an undirected graph, you should also add the following line:
            // toNode.neighbors.add(fromNode);
        }
    }

    private Node findNode(int value) {
        for (Node node : nodes) {
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }

    public void printGraph() {
        for (Node node : nodes) {
            System.out.print("Node " + node.value + " is connected to: ");
            for (Node neighbor : node.neighbors) {
                System.out.print(neighbor.value + " ");
            }
            System.out.println();
        }
    }
}
