# 🔄 Spring AOP Project (Aspect-Oriented Programming Demo)

## 📌 Project Overview
This project demonstrates the concept of **Aspect-Oriented Programming (AOP)** using the **Spring Framework**. It focuses on separating cross-cutting concerns like logging, monitoring, or security from the main business logic.

Spring AOP allows developers to write clean and modular code by handling repetitive tasks separately from core functionality.
 
---

## 🚀 Features
- Implementation of **Spring AOP using annotations**
- Use of `@Aspect`, `@Before`, `@After`, `@Around`
- Separation of **cross-cutting concerns**
- Clean and modular architecture
- Demonstrates method interception using AOP

---

## 🧠 Concepts Covered
- Aspect-Oriented Programming (AOP)
- Aspect, Advice, Join Point, Pointcut
- Proxy-based method interception
- Cross-cutting concerns (logging, security, transactions)

Spring AOP helps separate system-level concerns (like logging or transactions) from business logic, making applications more maintainable and scalable. :contentReference[oaicite:0]{index=0}

---

## 🛠️ Tech Stack
- Java
- Spring Framework
- Spring AOP
- Eclipse IDE

---

## 📂 Project Structure
src/
├── main/
│ ├── java/ # Business logic + Aspect classes
│ └── resources/ # Spring configuration
└── test/



---

## ⚙️ How It Works
- A **target class** contains business logic
- An **aspect class** defines additional behavior (logging, etc.)
- Spring creates a **proxy object**
- The proxy intercepts method calls and applies the aspect logic

AOP works by intercepting method execution and applying additional behavior before, after, or around the method call.

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/aryannehete14/spring_ax_aop.git
