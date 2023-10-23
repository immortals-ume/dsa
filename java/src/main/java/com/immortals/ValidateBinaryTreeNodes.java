package com.immortals;

class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                indegree[leftChild[i]]++;
                if (indegree[leftChild[i]] > 1) {
                    return false; // More than one incoming edge for a node.
                }
            }
            if (rightChild[i] != -1) {
                indegree[rightChild[i]]++;
                if (indegree[rightChild[i]] > 1) {
                    return false; // More than one incoming edge for a node.
                }
            }
        }

        int rootCount = 0;

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                rootCount++;
                if (rootCount > 1) {
                    return false; // Multiple nodes with no incoming edges.
                }
            }
        }

        if (rootCount == 0) {
            return false; // No root found.
        }

        // Ensure that the graph is connected and acyclic (no cycles).
        boolean[] visited = new boolean[n];
        return isConnectedAndAcyclic(0, leftChild, rightChild, visited);
    }

    private boolean isConnectedAndAcyclic(int node, int[] leftChild, int[] rightChild, boolean[] visited) {
        if (node == -1) {
            return true; // Null node is acyclic.
        }

        if (visited[node]) {
            return false; // Cycle detected.
        }

        visited[node] = true;
        return isConnectedAndAcyclic(leftChild[node], leftChild, rightChild, visited) && isConnectedAndAcyclic(rightChild[node], leftChild, rightChild, visited);
    }

}