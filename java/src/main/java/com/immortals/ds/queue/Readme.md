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

## Deque <a href="Deque.java">Deque</a>

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

## Priority queue (<a href="PriorityQueue.java">PriorityQueue</a> )

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

## Circular Queue

A circular queue, also known as a circular buffer or a ring buffer, is a data structure in computer science and
programming that operates as a queue but has a fixed size. Unlike a regular queue, where elements are added at one end
and removed from the other end, a circular queue allows you to wrap around when you reach the end of the queue,
effectively creating a circular data structure.

Here are some key features and operations associated with a circular queue:

      Fixed Size: A circular queue has a fixed size, meaning it can hold a maximum number of elements determined at the time
      of creation.
      
      Circular Behavior: When elements are added to the queue and it reaches its capacity, instead of rejecting new elements
      or resizing, a circular queue wraps around to the beginning of the queue and continues to overwrite the oldest elements.
      This behavior makes it suitable for situations where you want to maintain a rolling buffer of data.
      
      Front and Rear Pointers: A circular queue maintains two pointers, usually called "front" and "rear," to keep track of
      the position where elements are added and removed. The front pointer points to the element that is at the front of the
      queue, and the rear pointer points to the element that will be added next.
      
      Enqueue (Insertion): Adding an element to the circular queue is called "enqueuing." When you enqueue an element, you
      insert it at the rear of the queue. If the rear pointer reaches the end of the queue, it wraps around to the beginning.
      
      Dequeue (Removal): Removing an element from the circular queue is called "dequeuing." When you dequeue an element, you
      remove it from the front of the queue. If the front pointer reaches the end of the queue, it also wraps around to the
      beginning.
      
      Overflow and Underflow: Circular queues can face two main issues: overflow (when you try to enqueue an element into a
      full queue) and underflow (when you try to dequeue an element from an empty queue). Proper handling of these conditions
      is essential to prevent data corruption and errors.

Circular queues are commonly used in scenarios where you need to store a fixed amount of data in a continuous loop, such
as in audio processing, buffer management, and scheduling algorithms.

Implementing a circular queue typically involves maintaining an array or a linked list of fixed size and manipulating
the front and rear pointers to manage enqueue and dequeue operations efficiently while ensuring the circular behavior is
maintained.

##### Time And Space Complexity

Circular Queue Implemented Using an Array or a Linked List:

Time Complexity:

      Enqueue (Insertion): O(1) - Adding an element to the circular queue is a constant-time operation as it involves updating
      the rear pointer and placing the element in the array.
      Dequeue (Removal): O(1) - Removing an element from the circular queue is also a constant-time operation as it involves
      updating the front pointer and accessing the element in the array.
      Peek: O(1) - Peeking at the front element is a constant-time operation since it involves accessing an element in the
      array.
      Checking if the queue is empty or full: O(1) - Checking whether the queue is empty or full is also a constant-time
      operation, as it involves comparing the front and rear pointers.

Space Complexity:

      The space complexity of the circular queue implemented with a linked list is O(N), where N is the number of elements in
      the queue. This space is used to store the nodes of the linked list.

In summary, both implementations offer constant-time complexity for basic operations like enqueue, dequeue, peek, and
checking if the queue is empty or full. The space complexity is also similar, with both implementations having a space
complexity of O(N), where N is the maximum capacity (for the array-based implementation) or the number of elements (for
the linked list-based implementation) in the circular queue.