# Data Structures & Algorithms

This repository's sole purpose is to remind how some of the data structures and algorithms work in one page.

## Array
<details><summary>Array's Detailed Explanation</summary>
  
### Properties of Array
* Array can store data of specified data type
* It has **contiguous** memory location
* Every "cell" of an array has unique index
* Index starts with 0 instead of 1
* Size of array needs to be specified mendatorily and cannot be modified.

### Definition of Array
Array is a datastructure consisting of a collection of elements, each identified by array index. An array is stored such that the position of each element can be computed from its index cell by a mathematical formula.
* **One Dimensional Array** -> arr[col]
* **Two Dimensional Array** -> arr[row][col]
* **Three Dimensional Array** -> arr[depth][row][col]

_Note: **Java** supports upto **255** dimensional array:clap::clap::clap:_

### Time and Space Complexity of 1D Array
Particulars | Time Complexity | Space Complexity
----------- | --------------- | ----------------
Creating an empty array | O(1) | O(N)
Inserting a value in an array | O(1) | O(1)
Traversing a given array | O(N) | O(1)
Accessing given cell number | O(1) | O(1)
Searching a given value | O(N) | O(1)
Deleting a cell's value | O(1) | O(1)

### Time and Space Complexity of 2D Array
Particulars | Time Complexity | Space Complexity
----------- | --------------- | -----------------
Creating an array | O(1) | O(MN)
Inserting a value | O(1) | O(1)
Traversing given array | O(MN) | O(1)
Accessing given cell number | O(1) | O(1)
Searching a given value | O(MN) | O(1)
Deleting a given cell's value | O(1) | O(1)

### When to Use / Avoid Array?
#### Use
* When there is a need to store multiple similar type of data
* When random access is regular affair because it only takes O(1)
#### Avoid
* Data to be stored are non-homogenous
* When number of data to be stored is not know in advance

### Array Implementations
* [OneDimensionalArray](https://github.com/yeunyuankuo/Data-Structures-Algorithms/blob/master/Array/OneDimensionalArray.java)
* [TwoDimensionalArray](https://github.com/yeunyuankuo/Data-Structures-Algorithms/blob/master/Array/TwoDimensionalArray.java)
</details>


## LeetCode Checklist
:point_up_2:: optimal solution needed

:scream:: revisit
- - - -

<details>
  <summary>Things to remember when coding</summary>
  
* #### Questions involving Alphabet
  * Check if you can use array of size 26 to save space
  * `ch - 'A'` or `ch - 'a'` gives you the index of the alphabet. Depending on whether its capitalized or not
  
* #### Questions involving Cycles
  * Try Floyd's __Tortoise and Hare Algorithm__ to detect a cycle
    * Finding if there's duplicate element in an array or duplicate char in a string can also use this algo!
    
* #### How to write inline anonymous comparator for PriorityQueue
  ```java
  PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<>(){
      public int compare(ListNode node1, ListNode node2) {
          return node1.val - node2.val;
      }
  });
  ```
* #### Running Time Depends On:
  * Single vs Multi Processor
  * Read/Write Speed to Memory
  * 32 bit vs 64 bit machine
  * Input
  
* #### Time Complexity Analysis - General Rules
  * Running Time = Σ Running time of all fragments

</details>

- - - -
### Array
- [x] Two Sum (E)
- [x] Trapping Rain Water (H)
- [x] Task Scheduler (M) :scream:
- [ ] Find the Duplicate Number (M)
- [ ] Find All Duplicates in an Array (M)
### Linked List
- [x] Add Two Numbers (E)
- [x] Merge Two Sorted Lists (E)
- [x] Linked List Cycle (E)
- [x] Reverse Linked List (E)
- [x] Delete Node in a Linked List (E)
- [x] Merge k Sorted Lists (H)
### Stack
- [x] Valid Parentheses (E)
- [x] Min Stack (E)  :scream:
- [x] Binary Search Tree Iterator (M) :scream:
- [ ] Minimum Cost Tree From Leaf Values (M)
- [ ] Daily Temperatures (M)
### Queue
- [x] Moving Average From Data Stream (E)
- [x] Number Of Recent Calls (E) :scream:
- [ ] Max Sum Of Rectangle No Larger Than K (H)
### Recursion
### Math
### Backtracking
### String
### Tree
### Binary Search Tree
### Graph
### Hash Table
- [ ] Find All Anagrams in a String (M)
### Heap
### Trie
### Sorting
### Binary Search
### Sliding Window
### BFS
### DFS
### Bit Manipulation
### Segment Tree
### Union Find
### Ordered Map
### Minimax
### Binary Indexed Tree
### Line Sweep
### Random
### Brainteaser
### Geometry
### Two Pointers
### Rejection Sampling
### Reservoir Sampling
### Rolling Hash
### Suffix Array
### Desing
### Greedy
### Divide and Conquer
### Dynamic Programming
### Shell
### Concurrency
