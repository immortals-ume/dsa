package com.immortals.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUsingList {
    List<GraphNode> graphNodes;

    public GraphUsingList() {
        graphNodes = new ArrayList<>();
    }

    public static void main(String[] args) {
        GraphUsingList graph = new GraphUsingList();

        // Adding graphNodes
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
        graphNodes.add(new GraphNode(value));
    }

    public void addEdge(int from, int to) {
        GraphNode fromGraphNode = findNode(from);
        GraphNode toGraphNode = findNode(to);

        if (fromGraphNode != null && toGraphNode != null) {
            fromGraphNode.neighbors.add(toGraphNode);
            // For an undirected graph, you should also add the following line:
            // toGraphNode.neighbors.add(fromGraphNode);
        }
    }

    private GraphNode findNode(int value) {
        for (GraphNode graphNode : graphNodes) {
            if (graphNode.value == value) {
                return graphNode;
            }
        }
        return null;
    }

    public void printGraph() {
        for (GraphNode graphNode : graphNodes) {
            System.out.print("GraphNode " + graphNode.value + " is connected to: ");
            for (GraphNode neighbor : graphNode.neighbors) {
                System.out.print(neighbor.value + " ");
            }
            System.out.println();
        }
    }
}
