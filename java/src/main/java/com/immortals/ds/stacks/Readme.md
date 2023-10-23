# Data Structure : STACK

A stack is a fundamental data structure in computer science and programming. It is a linear data structure that follows
the Last-In, First-Out (LIFO) principle, meaning that the last element added to the stack is the first one to be
removed. Think of it like a stack of plates; you can only add or remove plates from the top of the stack.

A stack typically supports two primary operations:

    Push: This operation is used to add an element to the top of the stack.
    
    Pop: This operation is used to remove the element from the top of the stack.
    Additionally, stacks often support the following operations:
    
    Peek or Top: This operation allows you to view the top element without removing it.
    
    IsEmpty: This operation checks if the stack is empty.
    
    Size: This operation returns the number of elements in the stack.

Stacks are commonly used in various computer science and software engineering applications, including:

    Function call stack: In programming languages, a stack is used to keep track of function calls and returns. When a
    function is called, its context is pushed onto the stack, and when it returns, it's popped from the stack.
    
    Expression evaluation: Stacks can be used to evaluate expressions, such as infix, postfix, or prefix expressions, by
    maintaining operators and operands on the stack.
    
    Undo functionality: Stacks can be used to implement undo functionality in applications like text editors.
    
    Backtracking algorithms: Stacks are helpful in backtracking algorithms like depth-first search (DFS) for traversing
    graphs and solving problems like the Eight Queens puzzle.
    
    Browser history: Stacks can be used to keep track of the history of visited web pages in web browsers.
    
    Memory management: Stacks are used in memory management to keep track of allocated memory and function call frames.
    
    Syntax parsing: Stacks can be used in parsing algorithms to track the grammar rules and tokens.

Stacks can be implemented using arrays or linked lists, depending on the specific requirements of the application. In
some cases, there may be a need for additional variations of stacks, such as a double-ended stack (deque), which
supports adding and removing elements from both end

    Array-based Stack: This implementation uses an array to store the stack elements. It has constant-time access to
    elements, making it efficient for most stack operations. However, it may require resizing the array if the stack grows
    beyond its initial size.
    
    Linked List-based Stack: In this implementation, a linked list data structure is used to build the stack. Each graphNode
    in the linked list contains an element and a reference to the next graphNode. This approach avoids the need for resizing
    as in the array-based stack, but it may have slightly more overhead due to managing nodes.
    
    Dynamic Array Stack: Some languages and libraries provide dynamic arrays, such as Python's list or Java's ArrayList,
    which can be used as a stack by utilizing the built-in append and pop methods. These structures can dynamically resize
    themselves when needed.
    
    Double-Ended Queue (Deque): A deque is a more generalized data structure that allows elements to be added or removed
    from both ends. You can use a deque as a double-ended stack, often referred to as a "deque" instead of a stack. Python
    provides a collections.deque class that supports this functionality.

Time Complexity:

    Push Operation (Insertion): The time complexity for pushing an element onto a stack is O(1) on average. This is because
    you are simply adding an element to the top of the stack, and the time it takes is constant, regardless of the size of
    the stack.
    
    Pop Operation (Deletion): The time complexity for popping an element from a stack is also O(1) on average. Just like the
    push operation, it involves removing an element from the top of the stack, which takes constant time.
    
    Peek (Top) Operation: The time complexity for peeking at the top element of the stack is O(1) as well. It's a
    constant-time operation since you're just looking at the element without modifying the stack.
    
    IsEmpty Operation: Checking if the stack is empty can be done in O(1) time. It involves checking a simple condition, and
    the size of the stack does not affect the time complexity.
    
    Size Operation: Determining the number of elements in the stack with a size operation is also an O(1) operation. This is
    because, in most implementations, the size is tracked as an integer, and updating it when elements are pushed or popped
    is done in constant time.

Space Complexity:

The space complexity of a stack is primarily determined by the space required to store its elements and any additional
data structures used for its implementation.

    Array-based Stack: In an array-based stack, the space complexity is O(n), where "n" is the maximum number of elements
    that can be stored in the stack. This is because you allocate an array of fixed size, and the space is proportional to
    that size.
    
    Linked List-based Stack: In a linked list-based stack, the space complexity is also O(n), where "n" is the number of
    elements currently in the stack. Each element is stored in a separate graphNode, and the space usage is proportional to
    the number of elements.
    
    Double-Ended Stack (Deque): If you're using a deque as a double-ended stack, the space complexity is also O(n), where "
    n" is the number of elements in the deque.

It's important to note that the space complexity for both array-based and linked list-based stacks can be influenced by
factors such as dynamic resizing (in the case of arrays) or the overhead of maintaining nodes (in the case of linked
lists). However, the primary space complexity remains O(n) in practice.