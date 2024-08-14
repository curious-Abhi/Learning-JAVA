# Day 2: Diving into Java Control Flow Statements

## Chapter: Control Flow in Java

Today, you'll focus on understanding how to control the flow of your Java programs using conditional statements and loops. These concepts are crucial for solving problems efficiently.

---

## 1. Introduction to Control Flow

Control flow in Java refers to the order in which individual statements, instructions, or function calls are executed or evaluated. By controlling the flow of your program, you can make decisions, repeat actions, and handle different scenarios effectively.

### Key Concepts:
- **Sequential Execution**: Default mode where statements are executed one after another.
- **Conditional Execution**: Executing certain blocks of code based on conditions.
- **Repetition (Loops)**: Repeating blocks of code multiple times.

---

## 2. Conditional Statements

Conditional statements allow your program to make decisions and execute certain parts of the code based on whether a condition is true or false.

### 2.1 `if` Statement
The `if` statement checks a condition and executes the block of code inside it if the condition is true.

```java
int number = 10;
if (number > 0) {
    System.out.println("The number is positive.");
}
```

### 2.2 `if-else` Statement
The `if-else` statement provides an alternative path of execution when the condition is false.

```java
if (number > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is not positive.");
}
```

### 2.3 `else if` Ladder
The `else if` ladder is used when there are multiple conditions to check.
```java
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### 2.4 `switch` Statement
The `switch` statement is a multi-way branch statement that provides a cleaner way to execute code based on different values of a variable.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
```
---


## 3. Loops

Loops allow you to execute a block of code repeatedly as long as a specified condition is true. They are essential for tasks that require repetition.

### 3.1 `for` Loop
The `for` loop is used when the number of iterations is known beforehand.

```Syntax```
``` 
for (initialization; condition; increment/decrement) {
    // code to be executed
}
```
```Example```
```
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

```
### 3.2 while Loop
The while loop is used when the number of iterations is not known beforehand, and it depends on a condition.

```Syntax```
```
while (condition) {
    // code to be executed
}
```
```Example```
```
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### 3.3 do-while Loop
The do-while loop is similar to the while loop, but it guarantees that the loop will execute at least once.

```Syntax```
```
do {
    // code to be executed
} while (condition);
```
```Example```
```
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```

### Practice:
Experiment with all the control flow structures mentioned above.
Write simple programs to understand how these structures work.

