package com.immortals.algorithms.graph;


import java.util.LinkedList;

public class Bfs {
    private final int V; // Number of vertices
    private final LinkedList<Integer>[] adj; // Adjacency list representation

    public Bfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Bfs g = new Bfs(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);

        System.out.println("Breadth-First Traversal starting from vertex 0:");
        g.bfs(0);
        g.bfs(2);
    }

    public void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list
    }

    public void bfs(int start) {
        // Create a boolean array to keep track of visited nodes
        boolean[] visited = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            start = queue.poll();
            System.out.print(start + " ");

            // Get all adjacent vertices of the dequeued vertex
            // If an adjacent vertex has not been visited, mark it visited and enqueue it
            for (Integer neighbor : adj[start]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

