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

```

# Java Constants

In Java, **constants** are variables whose **value cannot be changed once assigned**.

---

## Declaring Constants

To declare a constant in Java, use the `final` keyword along with appropriate access modifiers like `static`.

### Syntax:

```
java final datatype CONSTANT_NAME = value;
```


# Java: Reading Input Using `Scanner`

In Java, the `Scanner` class (from `java.util`) is commonly used to read input from the user via the keyboard.

---

## Import and Setup

```java
Scanner sc = new Scanner(System.in);
```
* Creates a Scanner object named sc.
* System.in refers to standard input (keyboard).
## Read an Integer
```
int x = sc.nextInt();
```

* Reads an int input from the user and stores it in variable x.

```
System.out.println("Entered value is " + x);
System.out.println(x * x);
```

* Prints the entered value.
* Prints the square of the entered value (x * x).

## Read a Byte
```
int byteVal = sc.nextByte();
System.out.println("byte value is " + byteVal);
```
* Reads a byte value from input and stores it in byteVal.
* Byte is a smaller data type than int.

## Read a Single Word (No Spaces)
```
String word = sc.next();
System.out.println(word);
```
* Reads a single word (stops at whitespace).
* Example: input Hello World → word = "Hello"

## Read a Full Line (Including Spaces)
```
String word2 = sc.nextLine();
System.out.println("word s i " + word2);
```
* Reads a whole line including spaces.
* Important: If used after next(), nextInt(), etc., you may get a blank line due to leftover newline characters.
* To fix, add an extra sc.nextLine(); before this line when needed.

## Read a Single Character
```
char ca = sc.next().charAt(0);
```
* Reads the first character of the next word.
* Example: input Hello → ca = 'H'

## Close the Scanner (Good Practice)
```
sc.close();
```
* Always close the scanner when done to free system resources.

# Arithmetic Operations in Java

This project demonstrates basic arithmetic operations in Java, including addition, subtraction, division, multiplication, and modulo operations.

## Code Overview

The provided Java code performs the following arithmetic operations:

- **Addition**: Adds two integers (`a1 + b`).
- **Subtraction**: Subtracts one integer from another (`a2 - b2`).
- **Division**: Performs integer and floating-point division (`a2 / b2` and `a2 / (float)b2`).
- **Multiplication**: Multiplies two integers (`a2 * b2`).
- **Modulo**: Computes the remainder of division (`a2 % b2`).

## Code Snippet

```
// Addition
int a1 = 10;
int b = 20;
System.out.println(a1 + b); // Output: 30

// Subtraction
int a2 = 20;
int b2 = 3;
System.out.println(a2 - b2); // Output: 17

// Division
System.out.println(a2 / b2); // Output: 6 (integer division)
System.out.println(a2 / (float)b2); // Output: 6.6666665 (floating-point division)

// Multiplication
System.out.println(a2 * b2); // Output: 60

// Modulo Operator - Remainder
System.out.println(a2 % b2); // Output: 2
```
# Relational and Equality Operators in Java

This project demonstrates the use of relational and equality operators in Java, comparing two integer values and illustrating the difference between arithmetic assignment and equality operators.

## Code Overview

The provided Java code performs the following operations:

- **Relational Operators**: Compares two integers (`a2` and `b2`) using:
   - Equal to (`==`)
   - Greater than (`>`)
   - Less than (`<`)
   - Greater than or equal to (`>=`)
   - Less than or equal to (`<=`)
   - Not equal to (`!=`)
- **Arithmetic vs. Equality Operator**:
   - Arithmetic operator (`=`) assigns a value to a variable.
   - Equality operator (`==`) checks if two values are equal.

## Code Snippet

```
// Relational Operators
int a2 = 20;
int b2 = 3;
System.out.println(a2 == b2); // Output: false
System.out.println(a2 > b2);  // Output: true
System.out.println(a2 < b2);  // Output: false
System.out.println(a2 >= b2); // Output: true
System.out.println(a2 <= b2); // Output: false
System.out.println(a2 != b2); // Output: true

// Arithmetic vs Equality Operator
// Arithmetic operator assigns a value to a variable
int b4 = 50;
// Equality operator checks the equality between two values
System.out.println(a2 == b4); // Output: false

```