### Data Structure : Queue

A queue is a collection of entities that are maintained in a sequence and can be modified by the addition of entities at
one
end of the sequence and the removal of entities from the other end of the sequence.

The Following queue Implementation , going to be covered in the Repo

  <ol>
    <li>Simple Queue</li>
    <li>Dequeue</li>
    <li>Priority Queue</li>
    <li>Circular Queue</li>
    <li>Monotonic Queue</li>
  </ol>

## Simple Queue <a href="Queue.java">Queue</a>

    Simple Queue is linear Data structure were we can perform operations on both the Ends of the Queue. follows the FIFO
    principle,like a ticket line in (real world)<br>    

    Time complexity: All the operations have O(1) time complexity. <br>
    Auxiliary Space: O(N)

Following operations can be performed on the Queue   <br>

1. enqueue()
   - loads the values in the queue.<br>
2. dequeue()
    - removes the loaded value from the queue from front of the queue  <br>
3. peek()
    - returns the element from front of queue without the removing it   <br>
4. isFull()
    - returns boolean checks whether the queue is full or not , if full returns true otherwise false  <br>
5. isEmpty()
    - returns boolean checks whether the queue is empty or not ,if empty returns true otherwise false . <br>

### Deque <a href="Deque.java">Deque</a>

A deque, short for "double-ended queue," is a data structure that supports insertion and removal of elements from both
ends (the front and the rear) with constant time complexity. It combines the features of a stack (LIFO -
Last-In-First-Out) and a queue (FIFO - First-In-First-Out) into a single data structure, providing more flexibility for
various applications.

Key characteristics and operations of a deque:

Front and Rear Operations:

      addFront(item): Adds an item to the front of the deque.
      addRear(item): Adds an item to the rear of the deque.
      removeFront(): Removes and returns the item at the front of the deque.
      removeRear(): Removes and returns the item at the rear of the deque.
      peekFront(): Returns the item at the front of the deque without removing it.
      peekRear(): Returns the item at the rear of the deque without removing it.

Size and Emptiness:

      size(): Returns the number of elements in the deque.
      isEmpty(): Checks if the deque is empty.

Efficiency:

      A well-implemented deque can perform all of the above operations in constant time, O(1).

Usage:

      Deques are used in scenarios where you need fast insertions and removals at both ends of a collection.
      They can be used for implementing algorithms that require efficient manipulation of a queue or stack.

Implementation:

      Deques can be implemented using various data structures, such as doubly-linked lists, dynamic arrays, or circular buffers.
      The choice of implementation depends on the specific requirements of your application.

      Here's a brief explanation of how a deque works with a doubly-linked list-based implementation:

      In a doubly-linked list-based deque, each element is represented as a node containing data and references to the next and previous elements.
      The addFront operation creates a new node and updates references to insert the node at the front.
      The addRear operation creates a new node and updates references to insert the node at the rear.
      The removeFront operation removes the front node and updates references accordingly.
      The removeRear operation removes the rear node and updates references accordingly.
      The peekFront and peekRear operations simply return the data of the front and rear nodes without modifying the deque's structure.

      Deques are a versatile data structure and find applications in various algorithms, such as deque-based breadth-first search (BFS), implementing certain data structures like a queue or stack, and solving problems that require efficient manipulation of elements at both ends of a collection.

### Priority queue (<a href="PriorityQueue.java">PriorityQueue</a> )

A PriorityQueue is a data structure in computer science and programming that is used to store and manage a collection of
elements, typically in the form of a queue, where each element has an associated priority. Elements with higher priority
are dequeued (removed) before elements with lower priority, allowing for efficient management of tasks or items based on
their importance or urgency.

Key characteristics and operations of a PriorityQueue:

Priority Order:

      Elements in a PriorityQueue are ordered based on their priority.
      Elements with higher priority are removed (dequeued) before elements with lower priority.
      Priority Criteria:
    
      The priority can be defined in various ways, depending on the specific use case.
      Common priority criteria include numeric values, timestamps, or custom comparison rules.

Operations:

      enqueue(item, priority): Inserts an item into the queue with the specified priority.
      dequeue(): Removes and returns the item with the highest priority.
      peek(): Returns the item with the highest priority without removing it.
      isEmpty(): Checks if the priority queue is empty.
      size(): Returns the number of elements in the priority queue.

Efficiency:

      Priority queues are typically implemented using various data structures, such as binary heaps or balanced binary search trees (e.g., heap-based priority queue, or Java's PriorityQueue class uses a binary heap).
    
      Common operations (enqueue, dequeue, and peek) can be performed efficiently, usually in O(log n) time complexity for binary heap-based implementations, where n is the number of elements in the queue.
    
      Priority queues are especially useful when you need to efficiently retrieve the highest-priority element from a large collection of items.

Usage:

      Priority queues are commonly used in various applications, including task scheduling, job prioritization, graph algorithms (e.g., Dijkstra's algorithm for finding the shortest path), and Huffman coding for data compression, among others.
      They are a fundamental building block for solving problems that involve scheduling or ordering based on priorities.