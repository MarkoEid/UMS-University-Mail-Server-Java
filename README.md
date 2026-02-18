
# UMS - University Mail Server Simulation

A Java project designed to simulate a university mail system, focusing on robust software design using Object-Oriented Programming (OOP) principles. The system manages different types of users (Students, TAs, Lecturers) and their ability to send public and private messages based on specific academic roles and departments.

## 🚀 Key Features & OOP Implementation

### 1. Core OOP Principles
* [cite_start]**Encapsulation:** All instance variables are declared `private`, with access controlled through appropriate getter and setter methods to ensure data integrity[cite: 19, 20, 23].
* [cite_start]**Inheritance:** Implemented hierarchical structures for Users, Jobs, and Messages to promote code reusability[cite: 6, 32, 44, 24].
* [cite_start]**Polymorphism & Abstraction:** Utilized abstract concepts to handle various user behaviors and message types dynamically[cite: 6].

### 2. System Architecture
[cite_start]The project is organized into three specialized packages to maintain a clean "Separation of Concerns"[cite: 17, 18]:
* [cite_start]**`eg.fue.cs.users`:** Contains the `User` base class and its specialized versions, `PartTimeUser` and `FullTimeUser`[cite: 18, 73, 88].
* [cite_start]**`eg.fue.cs.messages`:** Manages communication logic through `Message`, `PrivateMessage`, and `PublicMessage` classes[cite: 18, 103, 115].
* [cite_start]**`eg.fue.cs.jobs`:** Defines academic roles including `Student`, `TeacherAssistant`, and `Lecturer`[cite: 18, 50, 55, 62].

### 3. Advanced Messaging Logic
The system enforces complex business rules for communication:
* [cite_start]**Role-Based Restrictions:** Students can only message other students[cite: 68]. [cite_start]TAs can message colleagues and students within their specialty.
* [cite_start]**User Type Rules:** Full-time users have unrestricted messaging to all types, while Part-time users are restricted by specialty when messaging peers[cite: 87, 102].
* [cite_start]**Message Privacy:** Private messages are restricted to users of the same type (e.g., TA to TA only)[cite: 112].

## 🛠️ Technologies Used
* **Language:** Java
* [cite_start]**Data Structures:** Dynamic lists (ArrayList) for managing inboxes and sent folders[cite: 8, 37, 38].
* **Environment:** Integrated Development Environment (IDE) for Java.

## 📂 Project Structure
* [cite_start]`Exercise 0-13`: Detailed implementation of user management, job assignment, and message handling logic[cite: 15, 115].
