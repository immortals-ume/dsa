package com.immortals.algorithms.graph;

import java.util.LinkedList;

class Dfs {
    private final int V; // Number of vertices
    private final LinkedList<Integer>[] adjList; // Adjacency list representation

    // Constructor
    public Dfs(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Dfs dfs = new Dfs(7);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(2, 6);

        System.out.println("Depth-First Traversal starting from vertex 0:");
        dfs.dfs();
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Depth-First Search
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Public DFS function to start the traversal
    public void dfs() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; ++i) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }
}
