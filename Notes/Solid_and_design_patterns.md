# Week 1 – SOLID Principles and Design Patterns

---

## 1. What are Design Patterns?

Design patterns are reusable solutions to common problems in software design. They represent best practices used by experienced developers to solve recurring problems.

**Why use design patterns:**
- Improve code maintainability and reusability
- Simplify debugging and testing
- Promote clean architecture and modular design
- Provide common terminology for team discussions

---

## 2. SOLID Principles of Object-Oriented Programming

SOLID is an acronym for five design principles intended to improve software structure and maintainability.

### 2.1 Single Responsibility Principle (SRP)

A class should have only one reason to change. It should do only one job.

**Example:**  
Separate `Book` and `BookPrinter` classes instead of handling both logic and printing in one.

---

### 2.2 Open-Closed Principle (OCP)

Software entities should be open for extension but closed for modification.

**Key idea:**  
Extend functionality using inheritance or interfaces, without modifying existing code.

---

### 2.3 Liskov Substitution Principle (LSP)

Subtypes should be substitutable for their base types without altering the correctness of the program.

**Key point:**  
Child classes should not throw unexpected exceptions or break functionality when used in place of the parent class.

---

### 2.4 Interface Segregation Principle (ISP)

Clients should not be forced to implement interfaces they do not use.

**Solution:**  
Break large interfaces into smaller, more specific ones.

---

### 2.5 Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions.

**How to implement:**
- Use interfaces
- Use dependency injection (constructor, setter, or framework)

---

## 3. Commonly Used Design Patterns (GoF – Gang of Four)

#### Singleton Pattern

- Ensures only one instance of a class exists.
- Used for logging, configuration, caching.

#### Factory Method Pattern

- Defines an interface for creating an object but lets subclasses decide which class to instantiate.
- Supports open/closed principle.

#### Builder Pattern

- Builds complex objects step-by-step.
- Allows different representations of an object using the same construction logic.

---

### 3.2 Structural Patterns

#### Adapter Pattern

- Converts the interface of a class into another interface clients expect.
- Helps incompatible interfaces work together.

#### Decorator Pattern

- Adds new behavior to an object dynamically without altering its structure.
- Alternative to subclassing.

#### Proxy Pattern

- Provides a placeholder for another object to control access, reduce cost, or add logging/security.

---

### 3.3 Behavioral Patterns

#### Observer Pattern

- Defines a one-to-many dependency.
- When the subject changes, all observers are notified automatically.

**Example**:  
UI event listeners, stock price updates.

#### Strategy Pattern

- Defines a family of interchangeable algorithms.
- Enables selecting algorithms at runtime.

**Example**:  
Different payment strategies: CreditCard, UPI, PayPal.

#### Command Pattern

- Encapsulates a request as an object.
- Allows parameterizing actions, queuing them, and implementing undo/redo.

**Example**:  
Remote control commands, menu actions.

---

## 4. Architectural Patterns

### Model-View-Controller (MVC)

- **Model**: Handles data and business logic.
- **View**: Displays data to the user.
- **Controller**: Accepts user input, updates model and view.

Encourages separation of concerns and easier testing.

### Dependency Injection (DI)

- A technique where an object receives other objects it depends on.
- Reduces tight coupling and makes code more testable.

**Example**:  
Injecting service classes into controllers via constructor or annotations.
