# Day 3: Understanding Arrays and Strings in Java

## 1. Understanding Arrays in Java

### 1.1 What is an Array?
An array is a data structure that stores a fixed-size sequential collection of elements of the same type.

#### Syntax:
```java
dataType[] arrayName = new dataType[size];
```
#### Example:
```
int[] numbers = new int[5]; // Declaration and instantiation
numbers[0] = 10; // Initialization
```
### 1.2. Types of Arrays:
### Single-Dimensional Array:
Example:
```
int[] arr = {1, 2, 3, 4, 5};
```
### Multi-Dimensional Array:
Example:
```
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### 1.3. Common Array Operations:
#### Traversing an Array:
Example:
```
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```
#### Finding the Maximum/Minimum Value:
Example:
```
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("Maximum value: " + max);
```

## 2. Understanding Strings in Java
### 2.1. What is a String?
A string is a sequence of characters. In Java, strings are objects that are immutable (cannot be changed once created).

Example:
```
String greeting = "Hello, World!";
```
#### 2.2. Common String Operations:

Concatenation:

Example
```
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
```
Finding Length:

Example
```
int length = greeting.length();
```
Substring Extraction:

Example:
```
String sub = greeting.substring(7, 12); // "World"
```

Character Search:

Example:
```
char ch = greeting.charAt(1); // 'e'
```