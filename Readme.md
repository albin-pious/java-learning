# Java Basics

## Code Structure

```java
// Here our code is wrapped under a class
/*
 * Main method is the entry point of every Java program
 * print statement will just print the string you provide
 * println statement will print the string and then add a new line character
 */
```
## Typecasting

Typecasting refers to changing the data type from one type to another.

### Types of Typecasting

1. **Widening Type Casting**
    - Automatically done by Java
    - Example: `int` → `long` → `float` → `double`

2. **Explicit Type Casting**
    - Manually done by the programmer
    - Example: `double` → `(int)`
# Lossy Conversion in Java

In Java, **lossy conversion** refers to a situation where **data might be lost** when converting from one data type to another — usually from a **larger/more precise type to a smaller/less precise one**.

---

##  What Causes Lossy Conversion?

This happens when:
- You're trying to **assign a value of a larger data type to a smaller one** without explicit casting.
- Java prevents this automatically to **avoid accidental data loss**.

---

### Example

```java
double myDouble = 9.99;
int myInt = myDouble; // Compilation error: possible lossy conversion from double to int
