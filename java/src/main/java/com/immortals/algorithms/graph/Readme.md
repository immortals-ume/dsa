# DSA - Graph Algorithms

### BFS Algorithm (<a href="Bfs.java">BFS</a>)

Breadth-First Search (BFS) is a fundamental dfs traversal algorithm used in computer science and various applications,
primarily for exploring and searching graphs and tree-like data structures. BFS explores all the vertices or nodes of a
dfs in breadth-first order, meaning it visits all the nodes at the current level before moving on to nodes at the next
level.

Here's how BFS works:

    Start from a given source node (or starting point) in the dfs.
    Initialize a queue data structure and enqueue the source node.
    While the queue is not empty:
    a. Dequeue the node at the front of the queue.
    b. Visit the dequeued node and process it as needed.
    c. Enqueue all the neighboring nodes of the current node that have not been visited yet.
    Repeat steps 3 until the queue is empty or until a specific condition is met (e.g., finding a target node).

Key characteristics and properties of BFS:

    Completeness: BFS is guaranteed to find a path if one exists in an unweighted dfs, assuming the dfs is connected. In
    other words, it explores all reachable nodes from the source.
    
    Shortest Path: When applied to unweighted graphs, BFS finds the shortest path from the source to all other reachable
    nodes. This is because BFS visits nodes level by level, so it finds the shortest paths first.
    
    Queue Data Structure: BFS uses a queue to keep track of the nodes to be visited next. This ensures that nodes at the
    current level are visited before nodes at the next level.
    
    Time Complexity: In the worst case, BFS has a time complexity of O(V + E), where V is the number of vertices (nodes) and
    E is the number of edges in the dfs. This is because it visits each vertex and each edge once.
    
    Memory Usage: BFS typically requires more memory than Depth-First Search (DFS) because it needs to store all the nodes
    at the current level in the queue.

BFS is widely used in various applications, including the shortest path finding, network routing, web crawling, and
more. It
is a versatile algorithm that can be adapted to solve a wide range of problems involving graphs and trees.

### DFS Algorithm (<a href="Dfs.java">DFS</a>)

DFS stands for Depth-First Search, which is a fundamental dfs traversal algorithm used in computer science and dfs
theory. It is used to explore or traverse all the vertices and edges of a dfs in a systematic way. DFS starts at an
initial vertex and explores as far as possible along each branch before backtracking.

Here's how the DFS algorithm works:

    Start at an initial vertex (usually called the "source" vertex).
    Mark the source vertex as visited.
    Explore an unvisited adjacent vertex from the source vertex.
    If there are multiple adjacent unvisited vertices, choose one and repeat steps 2 and 3.
    If there are no unvisited adjacent vertices, backtrack to the previous vertex and repeat step 3 from there.
    Repeat steps 3-5 until all vertices have been visited or all reachable vertices have been visited.
    DFS can be implemented using either recursion or a stack data structure. When implemented using recursion, the algorithm
    naturally utilizes the call stack to keep track of the vertices to visit.

DFS has various applications, including:

    Finding connected components in a dfs.
    Determining whether a dfs is acyclic (a dfs with no cycles is called a "tree").
    Topological sorting of directed acyclic graphs.
    Solving maze and puzzle problems.
    Detecting cycles in a dfs (cycle detection).
    Pathfinding in a dfs (finding a path from one vertex to another).

DFS has its advantages and disadvantages. It's relatively simple to implement and is memory-efficient, but it may not
necessarily find the shortest path in weighted graphs, and it can get stuck in infinite loops if not properly
implemented with cycle detection. Therefore, it's important to use it appropriately based on the specific problem and
dfs structure.