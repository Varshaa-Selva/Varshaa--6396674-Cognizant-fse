# SOLID Principles & Design Patterns (Java)

## What & Why?

- SOLID = 5 design principles for writing clean, maintainable, scalable OOP code.
- Design Patterns = Reusable solutions to common software design problems.
- GoF = Gang of Four (authors of "Design Patterns" book).

---

## SOLID Principles

### Single Responsibility Principle (SRP)
- A class should have only one reason to change.
- ➤ One class = One job.

### Open/Closed Principle (OCP)
- Classes should be open for extension, but closed for modification.
- ➤ Use inheritance or interfaces to add behavior.

### Liskov Substitution Principle (LSP)
- Child classes should be substitutable for parent classes without breaking functionality.

### Interface Segregation Principle (ISP)
- Don’t force classes to implement methods they don’t use.
- ➤ Prefer small, role-specific interfaces.

### Dependency Inversion Principle (DIP)
- High-level modules should depend on abstractions, not concrete implementations.

---

## Common Design Patterns

### Creational Patterns
- **Singleton** – One instance, global access.
- **Factory Method** – Create objects without exposing the instantiation logic.
- **Builder** – Construct complex objects step by step.

### Structural Patterns
- **Adapter** – Make incompatible interfaces work together.
- **Decorator** – Add behavior to objects dynamically.
- **Proxy** – Control access to another object.

### Behavioral Patterns
- **Observer** – One-to-many dependency updates automatically.
- **Strategy** – Define interchangeable algorithms.
- **Command** – Encapsulate requests as objects.

---

## Architectural Patterns

- **MVC (Model-View-Controller)** – Separate business logic, UI, and control flow.
- **Dependency Injection** – Inject dependencies (like services) via constructor/setters.

