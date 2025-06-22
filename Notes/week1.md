1. What are Design Patterns and Why Use Them?
Design Pattern = A reusable solution to a commonly occurring software design problem.

Helps make code more readable, maintainable, and scalable.

Based on best practices evolved over years.

Encourages modular thinking and improves communication among developers.

2. SOLID Principles of OOP
2.1 Single Responsibility Principle (SRP)
A class should have only one reason to change.

Do only one job.

Promotes clean separation of concerns.

2.2 Open/Closed Principle (OCP)
A class should be open for extension but closed for modification.

Use inheritance, polymorphism, or interfaces to extend without changing base code.

2.3 Liskov Substitution Principle (LSP)
Subtypes must be substitutable for their base types.

Child class should not break parent class behavior when used in place of it.

2.4 Interface Segregation Principle (ISP)
Clients should not be forced to depend on methods they don’t use.

Prefer multiple small, specific interfaces over one large general-purpose interface.

2.5 Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules, both should depend on abstractions.

Use interfaces and dependency injection.

3. Commonly Used Design Patterns
Creational Patterns
Singleton: Only one instance of a class (e.g., Logger)

Factory Method: Lets subclasses decide what object to create (e.g., DocumentFactory)

Builder: Step-by-step object construction (e.g., PizzaBuilder)

Structural Patterns
Adapter: Makes incompatible interfaces work together

Decorator: Adds functionality to an object at runtime

Proxy: Controls access to an object (e.g., access control, logging)

Behavioral Patterns
Observer: One-to-many dependency (e.g., newsletter subscriptions)

Strategy: Select algorithm at runtime (e.g., different payment methods)

Command: Encapsulate request as object (e.g., remote control commands)

Architectural Patterns
MVC: Model (data) – View (UI) – Controller (logic)

Dependency Injection: Injecting dependencies into classes via constructors or setters

4. Analysis of Algorithms
Why Study DSA & Algorithms?
To write efficient code.

Understand how solutions scale with input.

Optimize time and memory.

5. Time & Space Complexity Basics
Use Asymptotic Notation:

O(1) – Constant

O(n) – Linear

O(log n) – Logarithmic

O(n²) – Quadratic

Types of Analysis
Best Case: Fastest (usually unrealistic)

Average Case: Expected

Worst Case: Max time (most commonly considered)

6. Sorting Algorithms
Algorithm	Best Case	Avg Case	Worst Case	Space	Stable
Bubble Sort	O(n)	O(n²)	O(n²)	O(1)	Yes
Insertion Sort	O(n)	O(n²)	O(n²)	O(1)	Yes
Merge Sort	O(n log n)	O(n log n)	O(n log n)	O(n)	Yes
Quick Sort	O(n log n)	O(n log n)	O(n²)	O(log n)	No
Heap Sort	O(n log n)	O(n log n)	O(n log n)	O(1)	No

7. Arrays
Stored in contiguous memory.

Array traversal: O(n)

Search: O(n) for linear search

Use arrays when:

Fixed-size data

Random access needed

8. Linked Lists
Types:
Singly Linked List

Doubly Linked List

Circular Singly Linked List

Circular Doubly Linked List

Operations & Time Complexity:
Operation	Singly	Doubly
Traverse	O(n)	O(n)
Insert	O(1)*	O(1)*
Delete	O(1)*	O(1)*
Search	O(n)	O(n)

*Insert/delete at head

9. Searching
Linear Search
No need to sort

Time complexity: O(n)

Use for unsorted arrays

Binary Search
Works only on sorted arrays

Time complexity: O(log n)

Divide-and-conquer method