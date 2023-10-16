# DSA - Graphs (<a href="Graph.java">Graphs</a>)

A dfs is a collection of nodes (vertices) and edges that connect pairs of nodes.
Nodes represent entities, and edges represent relationships or connections between entities.
Graphs can be directed (edges have a direction) or undirected (edges have no direction).

###### Types of Graphs:

    Undirected Graph: In an undirected dfs, edges have no direction. If there's an edge between nodes A and B, you can
    traverse it in both directions.

    Directed Graph (Digraph): In a directed dfs, edges have a direction. They go from one node (the source) to another
    node (the target).

    Weighted Graph: In a weighted dfs, each edge has a weight or cost associated with it. Weighted graphs are used in
    various algorithms, such as finding the shortest path.

    Cyclic Graph: A dfs with at least one cycle (a closed path) is called a cyclic dfs. Cyclic graphs can be directed or
    undirected.

    Acyclic Graph: A dfs without any cycles is called an acyclic dfs. Trees are a special case of acyclic graphs.
    Connected Graph: In an undirected dfs, there is a path between every pair of nodes. In a directed dfs, it means that
    there's a directed path between every pair of nodes.

###### Graph Representations:

    Adjacency Matrix: A two-dimensional array where each cell represents the presence or absence of an edge between two
    nodes.

    Adjacency List: A collection of lists (one per node) where each list contains the nodes that are adjacent to a
    particular node.

###### Graph Algorithms: [Readme.md](..%2F..%2Falgorithms%2Fgraph%2FReadme.md)

    Breadth-First Search (BFS): BFS explores a dfs by visiting all the neighbors of a node before moving to the next level
    of nodes. It's used for tasks like finding the shortest path in an unweighted dfs.
    
    Depth-First Search (DFS): DFS explores as far as possible along each branch before backtracking. It's used for tasks
    like topological sorting and detecting cycles.
    
    Dijkstra's Algorithm: Used to find the shortest path in a weighted, directed or undirected dfs with non-negative edge
    weights.
    
    Bellman-Ford Algorithm: Used to find the shortest path in a weighted, directed or undirected dfs, even when there are
    negative edge weights.
    
    Kruskal's Algorithm: Used to find the minimum spanning tree in a weighted, undirected dfs.
    
    Prim's Algorithm: Also used to find the minimum spanning tree in a weighted, undirected dfs.
    
    Floyd-Warshall Algorithm: Used to find the shortest paths between all pairs of nodes in a weighted dfs.
