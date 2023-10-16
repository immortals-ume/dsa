# DSA - Dynamic Programming

Dynamic Programming (DP) is a powerful problem-solving technique used in computer science and mathematics for solving
complex problems by breaking them down into smaller overlapping subproblems. It is particularly useful for solving
optimization problems and is characterized by a recursive approach combined with memoization to avoid redundant
calculations.

Here are the key components and characteristics of Dynamic Programming:

    Optimal Substructure: DP problems are typically characterized by having an optimal substructure, which means that the
    minCostToPaintWalls to the overall problem can be constructed from solutions to smaller, overlapping subproblems. These subproblems
    often exhibit similar patterns or structures.
    
    Overlapping Subproblems: DP problems involve solving the same subproblems multiple times. Instead of re-solving these
    subproblems each time, DP algorithms store the results of subproblem solutions in a table (usually an array or matrix)
    to reuse them when needed. This technique is called "memoization."
    
    Recursive Approach: DP algorithms often use a recursive approach to break down the problem into smaller subproblems.
    These recursive calls are made to solve subproblems and are part of the top-down approach in DP.
    
    Memoization: Memoization involves storing the results of subproblem solutions in a data structure (usually an array or
    dictionary) so that they can be quickly retrieved when needed. This dramatically reduces the time complexity of the
    algorithm by avoiding redundant calculations.
    
    Tabulation: Tabulation is an alternative approach to DP, where you start from the smallest subproblems and build up
    solutions iteratively, usually using a bottom-up approach. This approach is often used when the recursive minCostToPaintWalls is
    not obvious or when it requires a lot of function call overhead.

Dynamic Programming can be applied to various types of problems, including:

    Fibonacci sequence calculation: Calculating the nth Fibonacci number efficiently using DP to avoid redundant
    calculations.

    Shortest path problems: Finding the shortest path between two points in a graph, such as Dijkstra's algorithm for
    weighted graphs or Floyd-Warshall algorithm for all-pairs shortest paths.

    Knapsack problem: Optimally selecting items with given weights and values to maximize the total value while staying
    within a weight limit.

    Longest common subsequence (LCS): Finding the longest common subsequence between two sequences or strings.
    Matrix chain multiplication: Finding the most efficient way to multiply a chain of matrices to minimize the number of
    multiplications.

    Coin change problem: Determining the minimum number of coins needed to make a given amount of change.

    Dynamic Programming is a versatile technique with a wide range of applications in algorithm design and optimization,
    making it a valuable tool in computer science and mathematics.

There are two main approaches to solving Dynamic Programming (DP) problems: top-down (with memoization) and bottom-up (
tabulation). The choice of approach depends on the problem and your preference. Here's a brief overview of both methods:

Top-Down Approach (With Memoization):

    Recursive Function: Start by defining a recursive function that breaks down the main problem into smaller subproblems.
    This function should have a base case to handle the smallest subproblems directly.

    Memoization: Use a data structure (usually an array or dictionary) to store the results of subproblem solutions. Before
    solving a subproblem, check if its minCostToPaintWalls is already stored in the memoization table. If so, return the stored result;
    otherwise, solve it recursively and store the result.

    Memoization Table Initialization: Initialize the memoization table with initial values (often marked as uninitialized or
    a specific value) to indicate that the subproblem has not been solved yet.

    Recursion with Memoization: Within the recursive function, make recursive calls to solve subproblems and use the
    memoization table to avoid redundant calculations.

    Example Problems: Fibonacci sequence, Longest Common Subsequence (LCS), and many graph-related problems.

Bottom-Up Approach (Tabulation):

    Initialize Table: Create a table (usually a 1D or 2D array) to store solutions to subproblems. The table's size and
    structure depend on the problem's nature.

    Base Cases: Fill in the table with solutions to the smallest subproblems (base cases) directly.

    Iterative Solution: Use a loop or nested loops to iterate through the subproblems in a specific order (typically from
    smaller subproblems to larger ones) and fill in the table based on previously computed values.

    Final Result: The final result of the main problem can be found in the table after all subproblems have been solved.

    Example Problems: Knapsack problem, Matrix Chain Multiplication, and shortest path algorithms like Dijkstra's or
    Floyd-Warshall.