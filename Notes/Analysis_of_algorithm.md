# Algorithms and Data Structures (DSA) Notes

---
## 1. Introduction to Data Structures and Algorithms

### Why Learn DSA?
- Helps in writing efficient and scalable code.
- Core for solving real-world problems in technical interviews and system design.
- Foundation for understanding frameworks, APIs, and complex system behavior.

### Types of Data Structures
- Linear: Arrays, Linked Lists, Stacks, Queues
- Non-Linear: Trees, Graphs
- Hash-based: HashMap, HashTable
- Advanced: Heap, Trie, Segment Tree, Fenwick Tree

---

## 2. Analysis of Algorithms

### Key Metrics
- **Time Complexity** – How runtime grows with input size `n`.
- **Space Complexity** – How much extra memory is needed.

### Asymptotic Notation
- **Big O (O)** – Worst-case scenario
- **Omega (Ω)** – Best-case scenario
- **Theta (Θ)** – Average-case scenario

### Common Time Complexities
| Notation   | Name         | Example Algorithms                |
|------------|--------------|-----------------------------------|
| O(1)       | Constant      | Accessing array element by index |
| O(log n)   | Logarithmic   | Binary Search                    |
| O(n)       | Linear        | Linear Search                    |
| O(n log n) | Log-linear    | Merge Sort, Quick Sort (avg)     |
| O(n²)      | Quadratic     | Bubble Sort, Insertion Sort      |

---

## 3. Best, Average, Worst Case Analysis

| Algorithm       | Best Case  | Average Case | Worst Case |
|------------------|------------|--------------|-------------|
| Linear Search     | O(1)       | O(n)         | O(n)        |
| Binary Search     | O(1)       | O(log n)     | O(log n)    |
| Bubble Sort       | O(n)       | O(n²)        | O(n²)       |
| Insertion Sort    | O(n)       | O(n²)        | O(n²)       |
| Merge Sort        | O(n log n) | O(n log n)   | O(n log n)  |
| Quick Sort        | O(n log n) | O(n log n)   | O(n²)       |
| Heap Sort         | O(n log n) | O(n log n)   | O(n log n)  |

---

## 4. Sorting Algorithms

### Bubble Sort
- Compare adjacent elements and swap if out of order.
- Best: O(n), Worst: O(n²)
- Easy to implement, not efficient for large datasets.

### Insertion Sort
- Build sorted array one element at a time.
- Best: O(n), Worst: O(n²)
- Good for small arrays.

### Merge Sort
- Divide array, sort halves recursively, then merge.
- Always O(n log n)
- Uses extra space, stable.

### Quick Sort
- Partition around a pivot, recursively sort partitions.
- Best/Average: O(n log n), Worst: O(n²)
- In-place, fast, not stable.

### Heap Sort
- Build heap and extract elements in order.
- Always O(n log n)
- In-place, not stable.

---

## 5. Arrays

### Array Basics
- Contiguous memory allocation.
- Fixed size, fast access (O(1) with index).

### Operations
- Traversal: O(n)
- Access: O(1)
- Insertion/Deletion (middle): O(n)
- Search (linear): O(n)

### Use Cases
- Random access needed
- Known fixed size in advance

---

## 6. Linked Lists

### Types
- Singly Linked List (SLL)
- Doubly Linked List (DLL)
- Circular Singly Linked List (CSLL)
- Circular Doubly Linked List (CDLL)

### Operations and Time Complexity

| Operation       | SLL        | DLL        |
|------------------|------------|------------|
| Traverse         | O(n)       | O(n)       |
| Insert at Head   | O(1)       | O(1)       |
| Insert at Tail   | O(n)       | O(1)*      |
| Delete at Head   | O(1)       | O(1)       |
| Delete at Tail   | O(n)       | O(1)*      |
| Search           | O(n)       | O(n)       |

\* If tail reference is maintained.

---

## 7. Searching Algorithms

### Linear Search
- Check each element until match is found.
- Works for unsorted arrays.
- Time complexity: O(n)

### Binary Search
- Divide sorted array in half repeatedly.
- Only works on sorted arrays.
- Time complexity: O(log n)

---

## 8. Recursive vs Iterative Algorithm Analysis

### Example: Factorial

- Recursive: `f(n) = n * f(n-1)`
  - Time: O(n), Space: O(n) (stack calls)
- Iterative: loop from 1 to n
  - Time: O(n), Space: O(1)

### How to Analyze Time Complexity
- Count iterations for loops (e.g., nested → multiply)
- Count recursive calls (use recurrence relation)

---

## Suggested Folder for This Note
`Notes/Week1_AlgorithmsAndDSA.md`

---

## Suggested Next Topics to Explore
- Stacks and Queues
- Trees (BST, AVL)
- Graphs (DFS, BFS)
- Dynamic Programming
