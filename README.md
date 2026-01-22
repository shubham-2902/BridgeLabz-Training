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

---
## 📅 Day 03 – Scenario-Based Data Structures Practice  
**Date: 13-Jan-2026**

### 🔹 Practice Details

| Problem | Data Structures Used | Brief Description |
|--------|---------------------|------------------|
| SmartCheckout – Supermarket Billing Queue | Queue, HashMap | Managed customer billing queues with fast price lookup and stock updates |
| ParcelTracker – Delivery Chain Management | Singly Linked List | Tracked parcel movement across delivery stages with forward traversal |
| ExamProctor – Online Exam Review System | Stack, HashMap, Functions | Recorded question navigation, stored answers, and auto-calculated scores |

📌 **Code link:**  
👉 [Day 03](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day3)

---
## 📅 Day 04 – Scenario-Based Sorting Algorithms  
**Date: 15-Jan-2026**

### 🔹 Practice Details

| Problem | Algorithm Used | Brief Description |
|--------|----------------|------------------|
| HospitalQueue – Patient Sorting by Criticality | Bubble Sort | Sorted ER patients by criticality using in-place comparison for small datasets |
| SmartShelf – Real-Time Book Arrangement | Insertion Sort | Maintained alphabetically sorted book list during real-time insertions |
| ZipZipMart – Daily Sales Summary Report | Merge Sort | Sorted large-scale sales records efficiently while preserving order |
| EventManager – Ticket Price Optimizer | Quick Sort | Optimized ticket price sorting for large, unsorted datasets |
| ExamCell – Student Rank Generator | Merge Sort | Generated rank lists by merging and sorting center-wise student scores |

📌 **Code Link:**  
👉 [Day 04 – Sorting Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day4)

---
## 📅 Day 05 – Scenario-Based Sorting Algorithms  
**Date: 16-Jan-2026**

### 🔹 Practice Details

| Problem | Algorithm Used | Brief Description |
|--------|----------------|------------------|
| RoboWarehouse – Shelf Loading Robot | Insertion Sort | Maintained ascending package order during dynamic insertions |
| CinemaHouse – Movie Time Sorting | Bubble Sort | Sorted small set of movie showtimes using simple in-place logic |
| CropMonitor – Sensor Data Ordering | Quick Sort | Sorted large, unordered sensor data efficiently by timestamp |

📌 **Code Link:**  
👉 [Day 05 – Sorting Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day5)

---
## 📅 Day 06 – Scenario-Based Sorting Algorithms  
**Date: 17-Jan-2026**

### 🔹 Practice Details

| Problem | Algorithm Used | Brief Description |
|--------|----------------|------------------|
| ArtExpo – Sort Artists by Registration Time | Insertion Sort | Maintained sorted artist registrations in real time based on entry order |
| FleetManager – Vehicle Maintenance Scheduler | Merge Sort | Merged sorted vehicle lists from multiple depots into a master schedule |
| IceCreamRush – Sorting Flavors by Popularity | Bubble Sort | Sorted a small list of ice cream flavors using adjacent comparisons |
| SmartLibrary – Auto-Sort Borrowed Books | Insertion Sort | Kept borrowed books alphabetically sorted during dynamic insertions |

📌 **Code Link:**  
👉 [Day 06 – Sorting Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day6)

---
## 📅 Day 07 – Scenario-Based Sorting Algorithms  
**Date: 19-Jan-2026**

### 🔹 Practice Details

| Problem | Algorithm Used | Brief Description |
|--------|----------------|------------------|
| EduResults – Rank Sheet Generator | Merge Sort | Merged sorted district-wise student lists into a stable state rank list |
| FlashDealz – Product Sorting by Discount | Quick Sort | Sorted large, unsorted product discounts efficiently |
| FitnessTracker – Daily Step Count Ranking | Bubble Sort | Generated daily rankings for a small user group with frequent updates |

📌 **Code Link:**  
👉 [Day 07 – Sorting Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day7)

---
## 📅 Day 08 – Scenario-Based Sorting Algorithms  
**Date: 20-Jan-2026**

### 🔹 Practice Details

| Problem | Algorithm Used | Brief Description |
|--------|----------------|------------------|
| MovieTime – Theater Show Listings | Insertion Sort | Inserted new showtimes in real time while maintaining sorted order |
| FoodFest – Sorting Stalls by Customer Footfall | Merge Sort | Combined zone-wise sorted footfall data into a stable master list |
| GamerZone – High Score Ranking System | Quick Sort | Ranked large, dynamic player scores efficiently for leaderboards |

📌 **Code Link:**  
👉 [Day 08 – Sorting Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day8)

---
## 📅 Day 09 – Scenario-Based Data Structures & Sorting  
**Date: 21-Jan-2026**

### 🔹 Practice Details

| Problem | Data Structures / Algorithm Used | Brief Description |
|--------|----------------------------------|------------------|
| TailorShop – Sorting Orders by Delivery Deadline | Insertion Sort | Inserted new tailoring orders into a nearly sorted list based on delivery dates |
| MedWarehouse – Sorting Medicines by Expiry | Merge Sort | Merged branch-wise sorted medicine lists to track expiry efficiently |
| University Digital Record System | Binary Search Tree (BST) | Managed student records with insertion, deletion, and sorted roll number display |
| E-Commerce Product Inventory | Binary Search Tree (BST) | Enabled fast product lookup, updates, and sorted SKU display |
| Music App – Track Library Organizer | Binary Search Tree (BST) | Organized songs using track IDs with efficient search and sorted traversal |

📌 **Code Link:**  
👉 [Day 09 – DSA Scenarios](https://github.com/shubham-2902/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based-codebase/JavaDSAScenarioBasedQ/src/com/day9)













