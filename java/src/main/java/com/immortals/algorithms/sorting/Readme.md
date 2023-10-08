# DSA - Sorting Algorithms

A Sorting Algorithm is used to rearrange a given array or list of elements according to a comparison operator on the
elements. <br>
The comparison operator is used to decide the new order of elements in the respective data structure.<br>
The following Algorithms will be covered : <br>

### Bubble Sorting Algorithm (<a href="BubbleSort.java">Bubble Sort</a>)

    It works by repeatedly swapping the adjacent elements if they are in the wrong order. <br>
    Time Complexity: O(N^2)
    Auxiliary Space: O(1)

### Insertion Sorting Algorithm (<a href="InsertionSort.java">Insertion Sort</a>)

    It works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part.
    The Values from the unsorted part are picked and placed at the correct position in the sorted part.
    Time Complexity: O(N^2)
    Auxiliary Space: O(1)

### Merge Sorting Algorithm ( <a href="MergeSort.java">Merge Sort</a>)

    It works by dividing an array into smaller subarrays, sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.  <br>
    Time Complexity: T(n) = 2T(n/2) + θ(n)
    Auxiliary Space: O(N)

### Counting Sorting Algorithm ( <a href="CountingSort.java">Counting Sort</a>)

    A non-comparison-based sorting algorithm that works well when there is limited range of input values. It is particularly efficient when the range of input values is small compared to the number of elements to be sorted. <br>
    Time Complexity: O(N+M), where N and M are the size of inputArray[] and countArray[] respectively.
        Worst-case: O(N+M).
        Average-case: O(N+M).
        Best-case: O(N+M).
    Auxiliary Space: O(N+M), where N and M are the space taken by outputArray[] and countArray[] respectively.

### Quick Sort Sorting Algorithm ( <a href="QuickSort.java">Quick Sort</a>)

    Quick Sort is a popular and efficient sorting algorithm that uses a divide-and-conquer approach to sort an array or list of elements. It works by selecting a "pivot" element and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
    The sub-arrays are then recursively sorted. <br>
    Time Complexity:

    Average Case: O(n log n) - Quick Sort typically exhibits good performance and is often faster than other sorting algorithms in practice.
    Best Case: O(n log n) - The best-case time complexity occurs when the pivot chosen in each step perfectly divides the array into two equal-sized sub-arrays. This ideal situation results in a balanced partition, leading to good performance.
    Worst Case: O(n^2) - The worst-case time complexity occurs when the pivot is consistently chosen as the minimum or maximum element in the array, resulting in an unbalanced partition. This worst-case scenario can be mitigated using randomized pivot selection or other pivot selection strategies like the median-of-three.
    
    Space Complexity:
    
    Quick Sort has a space complexity of O(log n) for the function call stack. This is because Quick Sort is a recursive algorithm, and the space required for the function call stack is proportional to the maximum recursion depth.
    In the worst case, when the algorithm is not well-balanced and approaches O(n) recursion depth, the space complexity is O(n).

### Selection Sort Sorting Algorithm ( <a href="SelectionSort.java">Selection Sort</a>)

    Selection sort is a simple comparison-based sorting algorithm that divides the input list into two parts: the sorted part and the unsorted part. It repeatedly selects the smallest (or largest, depending on the sorting order) element from the unsorted part and moves it to the end of the sorted part.  <br>
   
    Time Complexity:

    Worst-case time complexity: O(n^2)
    Average-case time complexity: O(n^2)
    Best-case time complexity: O(n^2)

    Selection sort has a time complexity of O(n^2) in all cases because it involves two nested loops. The outer loop runs n times, where n is the number of elements in the list, and for each iteration of the outer loop, the inner loop runs n - i times, where i is the current iteration of the outer loop. This results in a total of (n-1) + (n-2) + ... + 2 + 1 = n(n-1)/2 comparisons and swaps, which simplifies to O(n^2).

    Space Complexity:

    Selection sort is an in-place sorting algorithm, meaning it doesn't require additional memory allocation for sorting. Therefore, the space complexity of selection sort is O(1), which is constant. Regardless of the size of the input list, selection sort only uses a constant amount of extra memory to store temporary variables like indices and values for swapping elements.

### Heap Sort Sorting Algorithm ( <a href="HeapSort.java">Heap Sort</a>)

    Heap sort is a comparison-based sorting algorithm that uses a binary heap data structure to build a max-heap (for ascending order) or min-heap (for descending order) from the elements of the input array. Once the heap is constructed, it repeatedly extracts the maximum (or minimum) element from the heap and places it at the end of the sorted portion of the array. This process is repeated until the entire array is sorted.
    
    Time Complexity:
    Worst-case time complexity: O(n log n)
    Average-case time complexity: O(n log n)
    Best-case time complexity: O(n log n)
    Heap sort has a consistent time complexity of O(n log n) in all cases, whether it's the worst-case, average-case, or best-case scenario. This makes it an efficient sorting algorithm for large datasets.
    
    Space Complexity:
    Heap sort is an in-place sorting algorithm, meaning it doesn't require additional memory allocation for sorting. Therefore, the space complexity of heap sort is O(1), which is constant. Regardless of the size of the input array, heap sort only uses a constant amount of extra memory to store temporary variables for swapping elements within the array.
    To summarize, heap sort has a time complexity of O(n log n) and a space complexity of O(1), making it an efficient and in-place sorting algorithm suitable for large datasets.