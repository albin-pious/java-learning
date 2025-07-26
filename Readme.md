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

# Branching with If-Else in Java

This project demonstrates the use of `if-else` statements in Java for conditional branching, allowing the program to make decisions based on whether a condition evaluates to true or false.

## Code Overview

The provided Java code uses an `if-else` structure to check the value of a variable `x` and determine whether it is positive, negative, or neutral (zero). The `if` statement evaluates a boolean condition, and optional `else if` and `else` clauses handle alternative cases.

## Code Snippet

```
// The 'if' statement is used to test a condition. It checks boolean condition: true or false.
// It can optionally have an else if and an else statement attached with it as well.
int x; // Assume x is initialized with a value
if (x > 0) {
    System.out.println("Positive number");
} else if (x < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Neutral number");
}
```
# Switch Statements in Java

This project demonstrates the use of traditional and enhanced `switch` statements in Java for conditional branching, allowing the program to execute different blocks of code based on the value of a variable.

## Code Overview

The provided Java code includes three examples of `switch` statements:
1. **Traditional Switch Statement**: Maps an integer `month` to a day of the week, with a `default` case for invalid inputs.
2. **Enhanced Switch Statement**: Uses the arrow syntax (`->`) introduced in Java 12+ for concise case handling.
3. **Switch with Multiple Case Labels**: Evaluates a character `cha` to determine if it is a vowel or consonant, using multiple case labels for a single outcome.

## Code Snippet

```
// Traditional Switch Statement
int month; // Assume month is initialized with a value
switch (month) {
    case 1:
        System.out.println("Sun");
        break;
    case 2:
        System.out.println("Mon");
        break;
    case 3:
        System.out.println("Tue");
        break;
    case 4:
        System.out.println("Wed");
        break;
    case 5:
        System.out.println("Thu");
        break;
    case 6:
        System.out.println("Fri");
        break;
    case 7:
        System.out.println("Sat");
        break;
    default:
        System.out.println("Invalid Date");
}

// Enhanced Switch Statement
switch (month) {
    case 1 -> {
        System.out.println("I'm enhanced switch case");
    }
    case 2 -> {
        System.out.println("happy");
    }
    case 3 -> {
        System.out.println("coding");
    }
}

// Switch with Multiple Case Labels
Scanner sc = new Scanner(System.in);
char cha = sc.next().charAt(0);
switch (cha) {
    case 'a':
    case 'e':
        System.out.println("Vowels");
        break;
    default: 
        System.out.println("Consonant");
}
```
# Ternary Operator in Java

This project demonstrates the use of the ternary operator in Java, which provides a concise way to perform conditional evaluations as an alternative to an `if-else` statement.

## Code Overview

The provided Java code uses the ternary operator to evaluate whether an integer `num` is even or odd. The ternary operator (`?:`) checks a condition and returns one of two expressions based on whether the condition is true or false.

## Code Snippet

```
/**
 * Ternary operator is a condensed form of if-else statement which evaluates a condition 
 * and executes the code based on the evaluated condition.
 * result = (condition) ? expression1 : expression2;
 */
int num; // Assume num is initialized with a value
String result = num % 2 == 0 ? "even" : "odd";
System.out.println(result);
```

# Logical Operators in Java

This project demonstrates the use of logical operators in Java, including logical AND (`&&`), logical OR (`||`), and logical NOT (`!`), to perform conditional evaluations.

## Code Overview

The provided Java code showcases three logical operators:
1. **Logical AND (`&&`)**: Checks if a person is eligible to vote based on age and citizenship.
2. **Logical OR (`||`)**: Determines if a person could be a developer based on their knowledge of Java or Python.
3. **Logical NOT (`!`)**: Inverts a boolean value to control the execution of a conditional statement.

## Code Snippet

```
// Logical AND
int age = 20;
String citizenship = "Indian";
String ans1 = age >= 18 && citizenship == "Indian" ? "You can vote" : "You can't vote";
System.out.println(ans1);

// Logical OR
String ab = "Java";
String ac = "Python";
String result2 = ab == "Java" || ac == "Python" ? "Would be developer" : "Won't be developer";
System.out.println(result2);

// Logical NOT
boolean dd = true;
if (!dd) {
    System.out.println("hai");
}
```