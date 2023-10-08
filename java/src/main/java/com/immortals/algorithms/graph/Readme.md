# DSA - Graph Algorithms

### BFS Algorithm (<a href="Bfs.java">BFS</a>)

Breadth-First Search (BFS) is a fundamental graph traversal algorithm used in computer science and various applications,
primarily for exploring and searching graphs and tree-like data structures. BFS explores all the vertices or nodes of a
graph in breadth-first order, meaning it visits all the nodes at the current level before moving on to nodes at the next
level.

Here's how BFS works:

    Start from a given source node (or starting point) in the graph.
    Initialize a queue data structure and enqueue the source node.
    While the queue is not empty:
    a. Dequeue the node at the front of the queue.
    b. Visit the dequeued node and process it as needed.
    c. Enqueue all the neighboring nodes of the current node that have not been visited yet.
    Repeat steps 3 until the queue is empty or until a specific condition is met (e.g., finding a target node).

Key characteristics and properties of BFS:

    Completeness: BFS is guaranteed to find a path if one exists in an unweighted graph, assuming the graph is connected. In
    other words, it explores all reachable nodes from the source.
    
    Shortest Path: When applied to unweighted graphs, BFS finds the shortest path from the source to all other reachable
    nodes. This is because BFS visits nodes level by level, so it finds the shortest paths first.
    
    Queue Data Structure: BFS uses a queue to keep track of the nodes to be visited next. This ensures that nodes at the
    current level are visited before nodes at the next level.
    
    Time Complexity: In the worst case, BFS has a time complexity of O(V + E), where V is the number of vertices (nodes) and
    E is the number of edges in the graph. This is because it visits each vertex and each edge once.
    
    Memory Usage: BFS typically requires more memory than Depth-First Search (DFS) because it needs to store all the nodes
    at the current level in the queue.

BFS is widely used in various applications, including shortest path finding, network routing, web crawling, and more. It
is a versatile algorithm that can be adapted to solve a wide range of problems involving graphs and trees.