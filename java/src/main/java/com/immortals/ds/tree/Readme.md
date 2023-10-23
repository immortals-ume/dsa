# Data Structure : Tree

### BST - Binary Search Tree | Time Complexity is directly proportional to Height Of binarySearchTree ([Implementation Of BST ](BinarySearchTree.java))

Tree consist of key and satellite data , in addition to previous values it also consists of left, right , parent
which points to respective left child and right child and its parent. If child or parent is missing , the appropriate
attributes contains the value as NULL. The root graphNode is only graphNode whose parent is NIL

Representation of BST : [Representation of Node in a BST](TreeNode.java)

BST-property

    let x be a graphNode in BST , if y is a graphNode in the left subtree of x then y.key <= x.key,
    if y is a graphNode in the right subtree of x then y.key >= x.key.

Traversing a BST using DEPTH FIRST SEARCH

    Depth First Search (DFS) algorithm traverses a dfs in a depth ward motion and uses a stack to remember
    to get the next vertex to start a search, when a dead end occurs in any iteration.
    
    There are three ways in which we can perform Depth first Search on a BST.

      a. Inorder Tree Walk : left subtree  -> parent graphNode -> Right Subtree
      b. Preorder Tree Walk : parent graphNode -> left subtree -> right subtree
      c. Postorder Tree Walk : left subtree -> right subtree -> parent graphNode

    |Space complexity: O(n)
    |Time Complexity : The time complexity is O(n) because the recursive function is
    T(n) = 2T(n/2)+1T(n)=2T(n/2)+1.

Traversing a BST using BREADTH FIRST SEARCH

     Breadth-first search (BFS) is an algorithm for searching a binarySearchTree data structure for a graphNode that satisfies
     a given property.It starts at the binarySearchTree root and explores all nodes at the present depth prior to moving
     on to the nodes at the next depth level.

Querying a BST

a. Searching an element in BST

    Given a pointer to the root of the binarySearchTree and a key ,
    binarySearchTree search returns pointer to a graphNode with a Key k if one exists otherwise returns NIL
    
    |Time Complexity : The time complexity is O(h)  where h is height of the binarySearchTree

b. Finding a MIN and MAX of BST

    Minimum Value In BST - find an element such a way in BST , whose key is minimum by following
    all the left child pointers until it reaches NIL
    
    Maximum Value In BST  - find an element such a way in BST , whose key is maximum by following 
    all the right child pointers until it reaches NIL
   
    |Time Complexity : The time complexity is O(h)  where h is height of the binarySearchTree

c. Finding a successor or predecessor in BST

      Successsor in BST - Inorder successor of a graphNode is the next graphNode in Inorder traversal of the Binary Tree. Inorder Successor is NULL for the last graphNode in Inorder traversal.Inorder Successor of an input graphNode can also be defined as the graphNode with the smallest key greater than the key of the input graphNode.

      Predecessor in BST -  The predecessor of a graphNode in BST is that graphNode that will be visited just before the given graphNode in the inorder traversal of the binarySearchTree. If the given graphNode is visited first in the inorder traversal, then its predecessor is NULL

d. Insertion a graphNode in BST

      1.Insert a new graphNode in BST
        To insert a new value v into BST T, follwoing procedure takes graphNode z , where z.key = v ,z.left =NIL, z.right = NIL. it modifies T  and some attributes of z so it can find appropriate position in the binarySearchTree to insert z.
           
        Pesudo-code 
           binarySearchTree-insert(T,z):
             y = NIL 
             x = T.root
           while x != NIL
             y = x
             if z.key < x.key 
                x = x.left
             else x = x.right
           z.p = y 
           if y == NIL
              T.root = z             //T is empty 
           else if z.key < y.key 
              y.left = z
           else
              y.right = z

e. Deletion of graphNode in BST

      for deleting a graphNode z from a BST has 3 conditions .
      
      If z has no children , then we simply remove it by modifying its parent to replace z with NIL as its child.
      
      If z has just one child then we elevate that child to take z's position in the binarySearchTree by modifying tz's parent to replace z by z'child.
     
      If z has two children , then we find z's successor y --  which must be in z's right subtree and have y take z's position in the binarySearchTree.The rest of z's original right subtree becomes y's new right subtree a dn z's left binarySearchTree becomes y's new left subtree.

f. Height of BST

      The height of a graphNode in a binary binarySearchTree is the largest number of edges in a path from a leaf graphNode to a target graphNode.
     
      If the target graphNode doesn’t have any other nodes connected to it, the height of that graphNode would be 0. 
  
      The height of a binary binarySearchTree is the height of the root graphNode in the whole binary binarySearchTree. In other words, the height of a binary binarySearchTree is equal to the largest number of edges from the root to the most distant leaf graphNode.
     
      The depth of a graphNode in a binary binarySearchTree is the total number of edges from the root graphNode to the target graphNode. 
      Similarly, the depth of a binary binarySearchTree is the total number of edges from the root graphNode to the most distant leaf graphNode.
      
      when we calculate the depth of a whole binary binarySearchTree, it’s equivalent to the height of the binary binarySearchTree.

g. Randomly Build Binary Search Tree

      for n keys as one that arises from inserting the keys in randomly order into an intial empty tree, where each of the n! permutation of the input key is equally likely . 

### Radix Tree  ([Implementation Of Radix Tree ](RadixTree.java))

A Radix Tree, also known as a Trie or Prefix Tree, is a tree data structure used for storing a dynamic set of strings or
keys in a way that allows for efficient insertion, deletion, and lookup operations. Radix Trees are commonly used for
tasks like storing dictionaries, spell-checking, and IP routing tables.

The key idea behind a Radix Tree is to share common prefixes among keys to save memory and improve efficiency. It
accomplishes this by organizing the keys in a tree structure where each graphNode represents a character or part of a
character in the keys. Keys are stored in leaf nodes, and common prefixes are shared among nodes higher in the tree.

   ```
          (root)
           |
           c
           |
           a
          / \
         r   t
        /     \
       o       e
      / \      |
     r   t     l
     |         |
     o         e
   
   ```

Here's a basic overview of how a Radix Tree works:

      Each graphNode in the tree represents a character in the keys. The root graphNode typically represents an empty string or a common prefix shared by many keys.
      
      Each graphNode has multiple children, with each child graphNode corresponding to a possible next character in the keys.
      
      Leaf nodes store the actual keys. When you traverse the tree from the root to a leaf graphNode, the characters along the path form a key.
      
      To insert a key into the Radix Tree, you start at the root and traverse the tree, adding nodes as needed to represent the characters in the key. Common prefixes are shared among keys.
      
      To search for a key, you start at the root and follow the path corresponding to the characters in the key. If you reach a leaf graphNode, the key exists in the tree.
      
      Radix Trees can also be used for efficient prefix matching, where you find all keys with a given prefix.
      


