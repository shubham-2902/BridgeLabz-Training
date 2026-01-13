# 📅 Week 03 – Data Structures & Algorithms
This branch serves as a dedicated space for my ongoing journey in mastering Data Structures and Algorithms (DSA).

---

**🗓 Day 1: Linked List (Singly, Doubly & Circular)**  
**Date: 2 January 2026**

🔹 Topics Covered

Singly Linked List  
- Understood node structure with data and next reference  

Doubly Linked List  
- Used previous and next references for traversal and updates  

Circular Linked List  
- Implemented circular traversal using `tail.next = head`  

Algorithmic Thinking  
- Applied traversal-based logic  
- Compared node values and maintained counters  
- Designed efficient solutions using linked list properties  

✅ Practice Summary

Solved **9 Linked List–based programs** covering Singly, Doubly, and Circular Linked Lists:

Singly Linked List  
- Student Record Management System  
- Inventory Management System  
- Social Media Friend Connections  

Doubly Linked List  
- Movie Management System  
- Library Management System  
- Undo/Redo Functionality for Text Editor  

Circular Linked List  
- Task Scheduler  
- Online Ticket Reservation System  
- Round Robin Scheduling Algorithm  

🔗 Code link:  
👉 Week 03 – [Linked List Programs](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDSAPractice/src/linkedlist)

---

**🗓 Day 2: Stack, Queue & Hashing**  
**Date: 3 January 2026**

🔹 Topics Covered

Stacks  
- LIFO behavior and real-world use cases  
- Recursive and nested problem solving  
- Stack underflow and overflow handling  
- Efficient implementation using Java Collections  

Queues  
- FIFO behavior and applications  
- Simple Queue, Deque, and Priority Queue  
- Circular queue concepts  
- Safe enqueue and dequeue operations  

Hash Maps & Hashing  
- Hashing fundamentals and hash functions  
- Fast lookup using HashMap  
- Collision handling with separate chaining  
- Custom HashMap implementation  

Best Practices  
- Avoided infinite recursion  
- Validated empty stack and queue operations  
- Used auxiliary data structures for optimization  

✅ Practice Summary

Solved **10 Stack, Queue, and HashMap–based problems**:

Stack & Queue Problems  
- Queue Using Two Stacks  
- Sort a Stack Using Recursion  
- Stock Span Problem  
- Sliding Window Maximum  
- Circular Tour (Petrol Pump Problem)  

Hash Map & Hashing Problems  
- Find All Subarrays with Zero Sum  
- Check for a Pair with Given Sum  
- Longest Consecutive Sequence  
- Custom Hash Map Implementation  
- Two Sum Problem  

🔗 Code link:  
👉 Week 03 – [Stack, Queue & Hashing Programs](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDSAPractice/src/stackandqueues)

---

**🗓 Day 3: Sorting Algorithms**  
**Date: 5 January 2026**

🔹 Topics Covered

Sorting Fundamentals  
- Understood comparison-based and non-comparison-based sorting  
- Learned time and space complexity trade-offs  
- Applied sorting logic to real-world scenarios  

Comparison-Based Sorting  
- Bubble Sort  
- Insertion Sort  
- Selection Sort  
- Merge Sort  
- Quick Sort  
- Heap Sort  

Non-Comparison Sorting  
- Counting Sort  

Best Practices  
- Chose sorting algorithms based on data size and constraints  
- Applied stable vs unstable sorting concepts  
- Optimized performance using divide-and-conquer strategies  

✅ Practice Summary

Solved **7 sorting-based problems** using different algorithms:

- Bubble Sort – Sort Student Marks  
- Insertion Sort – Sort Employee IDs  
- Merge Sort – Sort Book Prices  
- Quick Sort – Sort Product Prices  
- Selection Sort – Sort Exam Scores  
- Heap Sort – Sort Job Applicants by Salary  
- Counting Sort – Sort Student Ages  

🔗 Code link:  
👉 Week 03 – [Sorting Algorithms](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDSAPractice/src/sortingalgorithm)

---

## 📅 Day 4 –  String builder and buffer, Linear Search, Binary Search and InputStreamReader
**Date: 6-Jan-2026**

### 🔹 Topics Overview
This day focused on strengthening Java fundamentals related to **string manipulation**, **input/output streams**, and **searching algorithms**.  
Emphasis was placed on understanding performance differences between mutable string classes, efficient file handling, and applying linear and binary search techniques to solve real-world problems.

### 🔹 Practice Summary

| Category | Problem | Description |
|--------|--------|------------|
| StringBuilder | Reverse a String | Reversed a string using `StringBuilder.reverse()` |
| StringBuilder | Remove Duplicates | Removed duplicate characters while maintaining order |
| StringBuffer | Efficient Concatenation | Concatenated an array of strings efficiently |
| StringBuffer | Performance Comparison | Compared `StringBuffer` vs `StringBuilder` for large concatenations |
| FileReader | Read File Line by Line | Read and printed file contents using `FileReader` and `BufferedReader` |
| FileReader | Word Occurrence Count | Counted occurrences of a specific word in a file |
| InputStreamReader | Byte to Char Conversion | Converted byte stream to character stream using `InputStreamReader` |
| InputStreamReader | Console Input to File | Read user input and wrote it to a file until exit command |
| Challenge | API Performance Comparison | Compared `StringBuilder`, `StringBuffer`, `FileReader`, and `InputStreamReader` |
| Linear Search | First Negative Number | Found index of the first negative number in an array |
| Linear Search | Word Search in Sentences | Searched for a word in a list of sentences |
| Binary Search | Rotation Point | Found smallest element in a rotated sorted array |
| Binary Search | Peak Element | Found a peak element using binary search |
| Binary Search | Search in 2D Matrix | Searched a target value in a sorted 2D matrix |
| Binary Search | First & Last Occurrence | Found first and last occurrence of an element |
| Challenge | Missing Positive & Target Index | Linear search for missing positive and binary search for target |

---

🔗 Code link:  
👉 Week 03 – [Linear Search and Binary Search](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDSAPractice/src/stringbufferandbuilderpluslinearsearchandbinarysearch)

---
## 📅 Day 5 – Algorithm's Runtime Analysis & Big-O Notation
**Date: 7-Jan-2026**

### 🔹 Topics Overview
This day focused on **analyzing time complexity and performance trade-offs** across different algorithms, data structures, and Java utilities.  
The goal was to understand how algorithm choice impacts execution time and scalability when working with large datasets.

---

### 🔹 Practice Summary

| No. | Problem | Comparison Focus | Key Observation |
|----|--------|-----------------|----------------|
| 1 | Search in Large Dataset | Linear Search vs Binary Search | Binary Search scales better for large, sorted datasets |
| 2 | Sorting Large Data | Bubble vs Merge vs Quick Sort | Bubble Sort is impractical; Merge & Quick Sort are efficient |
| 3 | String Concatenation Performance | String vs StringBuilder vs StringBuffer | StringBuilder/StringBuffer outperform String significantly |
| 4 | Large File Reading Efficiency | FileReader vs InputStreamReader | InputStreamReader performs better for large files |
| 5 | Fibonacci Computation | Recursive vs Iterative | Iterative approach is faster and memory-efficient |
| 6 | Searching with Data Structures | Array vs HashSet vs TreeSet | HashSet offers fastest lookup; TreeSet preserves order |

---
🔗 Code link:  
👉 Week 03 – [Algorithm's Runtime Analysis](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDSAPractice/src/complexityanalysis)

---
 📌. Scenario-Based Data Structures Practice 
---
## 📅 Day 1– Scenario-Based Data Structures Practice 
**Date: 10-Jan-2026**

### 🔹 Topics Overview
This day focused on applying **Data Structures in real-world scenarios**, combining Linked Lists, Stacks, Queues, HashMaps, and utility functions.  
The emphasis was on modeling realistic workflows while ensuring efficient data access, traversal, and updates.

---

### 🔹 Practice Summary

| No. | Problem | Data Structures Used | Scenario Description |
|----|--------|---------------------|----------------------|
| 1 | BookShelf – Library Organizer | HashMap, LinkedList, HashSet | Managed genre-wise book catalogs with efficient insert, delete, and duplicate control |
| 2 | BrowserBuddy – Tab History Manager | Doubly Linked List, Stack | Implemented browser navigation with back/forward history and tab restoration |
| 3 | AmbulanceRoute – Emergency Patient Navigation | Circular Linked List | Simulated ambulance routing across hospital units in a circular path |
---
  📌. Code link:  
👉  [Day 01](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day1)

---
## 📅 Day 2 – Scenario-Based Data Structures Practice  
**Date: 12-Jan-2026**

### 🔹 Topics Overview
This day focused on solving **real-world system simulations** using queues, stacks, linked lists, and hash-based data structures.  
The problems emphasized managing dynamic flows, navigation, history tracking, and priority-based processing.

---

### 🔹 Practice Summary

| No. | Problem | Data Structures Used | Scenario Description |
|----|--------|---------------------|----------------------|
| 4 | CallCenter – Customer Queue Manager | Queue, PriorityQueue, HashMap | Managed incoming customer calls with VIP priority handling and call tracking |
| 5 | TrainCompanion – Compartment Navigation System | Doubly Linked List | Enabled forward/backward navigation and dynamic compartment management |
| 6 | TextEditor – Undo/Redo Functionality | Stack | Implemented undo and redo operations using separate stacks |
| 7 | TrafficManager – Roundabout Vehicle Flow | Circular Linked List, Queue | Simulated vehicle movement and waiting queues in a roundabout |
---
 📌. Code link:  
👉  [Day 02](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day2)
