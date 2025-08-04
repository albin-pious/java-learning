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
# For Loop in Java

This project demonstrates the use of the `for` loop in Java to execute a block of code a specific number of times, ideal when the number of iterations is known in advance.

## Code Overview

The provided Java code uses a `for` loop to print numbers from 1 to 10. The loop consists of:
- **Initialization**: Setting the starting value of the loop variable.
- **Condition**: Checking whether the loop should continue.
- **Update**: Modifying the loop variable after each iteration.

## Code Snippet

```
/*
 * For loop
 * Java for loop is used to execute a block of code a certain number of times.
 * It is recommended to use for loop when the exact number of iterations is known beforehand.
 * The syntax of for loop is:
 *     for(initialisation; condition; update) {
 *         body of the loop
 *     }
 */
for (int i = 1; i <= 10; i++) {
    System.out.println(i + "\n");
}
```
# While Loop in Java

This project demonstrates the use of the `while` loop in Java to execute a block of code repeatedly until a specified condition is no longer true.

## Code Overview

The provided Java code uses a `while` loop to print numbers from 1 to 10. The loop continues as long as the condition `i <= 10` is met, and the loop variable `i` is incremented inside the loop body.

## Code Snippet

```
/*
 * While loops
 * The Java while loop is used to execute a specific block of code until a certain condition is met.
 * The syntax of the while loop is:
 *
 * while (condition) {
 *     body of loop
 * }
 */
int i = 1;
while (i <= 10) {
    System.out.println("%d" + i);
    i++;
}
```

# Do-While Loop in Java

This project demonstrates the use of the `do-while` loop in Java, which executes a block of code at least once before checking a condition to determine whether to continue looping.

## Code Overview

The provided Java code uses a `do-while` loop to print "hi" and increment a variable `i` until `i` is no longer less than 5. Unlike a `while` loop, the `do-while` loop guarantees that the loop body executes at least once, regardless of the condition.

## Code Snippet

```
/*
 * do-while loop
 * The do-while loop is very similar to the while loop. However, the body of do-while loop is executed once before
 * the condition is checked.
 * The syntax of the do-while loop is:
 * do {
 *     body of the loop
 * } while (condition);
 */
int i = 1; // Assume i is initialized
do {
    System.out.println("hi");
    i++;
} while (i < 5);
```

# For-Each Loop in Java

This project demonstrates the use of the for-each loop (also known as the enhanced for loop) in Java, introduced in Java 5, for iterating over elements in an iterable, such as an array or collection.

## Code Overview

The provided Java code uses a for-each loop to iterate over an integer array `newArr` and print each element. The for-each loop simplifies traversal by directly accessing each element without needing an index variable.

## Code Snippet

```
/*
 * The for-each loop in Java, also called as 'enhanced for loop', was introduced in Java 5. It is one of the
 * alternative approaches that are used for traversing the iterable. As the name ensures, it is mainly used to
 * iterate over each of the iterable elements one by one.
 */
int[] newArr = {5, 3, 2, 4, 1};
for (int k : newArr) {
    System.out.println(k);
}
```
# String Class in Java

This project demonstrates the basic usage of the `String` class in Java, which represents immutable character strings.

## Code Overview

The provided Java code creates a `String` object, prints its value, and displays its length using the `length()` method. The `String` class is used to handle string literals, such as `"hello"`, which are immutable in Java, meaning their content cannot be changed once created.

## Code Snippet

```
/*
 * The String class represents character strings. All string literals in Java programs, such as "abc", are
 * implemented as instances of this class. Strings in Java are immutable.
 */
String s = "hello";
System.out.println(s);
System.out.println(s.length());
```

# Strings Using `new` Keyword in Java

This project demonstrates the creation of strings in Java using the `new` keyword and compares strings using both the `==` operator and the `equals()` method to highlight the difference between string literals and objects created with `new`.

## Code Overview

The provided Java code shows two ways to create strings:
- **String Literal**: Stored in the string pool for memory efficiency.
- **Using `new` Keyword**: Creates a new `String` object on the heap, outside the string pool.
  The code compares these strings using `==` (reference comparison) and `equals()` (content comparison) to illustrate their behavior.

## Code Snippet

```
/*
 * We can also create new strings using the new keyword. These strings do not reside in the String pool,
 * instead they are created and stored in the heap memory.
 */
// String Pool
String s1 = "abc"; // Stored in the string pool
String s2 = new String("abc"); // New object in heap memory

if (s1 == s2) {
    System.out.println("This will not work");
}
if (s1.equals(s2)) {
    System.out.println("This will work");
}
```

# String Class Methods in Java

This project demonstrates the usage of various methods provided by the `String` class in Java for manipulating and analyzing strings.

## Code Overview

The provided Java code illustrates several commonly used `String` class methods:
- **charAt(int index)**: Retrieves the character at a specified index.
- **length()**: Returns the length of the string.
- **indexOf(char/String)**: Finds the index of the first occurrence of a character or substring, or returns -1 if not found.
- **equals(Object)**: Compares two strings for content equality.
- **contains(CharSequence)**: Checks if a string contains a specified sequence of characters.
- **toLowerCase() / toUpperCase()**: Converts the string to lowercase or uppercase, returning a new string.
- **replace(CharSequence, CharSequence)**: Replaces occurrences of a target substring with a replacement string.
- **substring(int beginIndex, int endIndex)**: Extracts a substring from the specified start index to the end index (exclusive).
- **Concatenation (+)**: Combines strings or strings with other data types using the `+` operator, with automatic type conversion for primitives and `toString()` for objects.

## Code Snippet

```
/*
 * String class offers several methods out of the box. We will be looking at some of them in this section.
 */
String s1 = "abc";
String s2 = "I love Programming";

// charAt: Access character at specified index
System.out.println(s2.charAt(2)); // Output: l

// length: Returns the length of the string
System.out.println(s2.length()); // Output: 17

// indexOf: Returns index of first occurrence of char or string, or -1 if not found
System.out.println(s2.indexOf('w')); // Output: -1
System.out.println(s2.indexOf("ll")); // Output: 3

// equals: Compares two strings for content equality
System.out.println(s2.equals(s1)); // Output: false

// contains: Checks if string contains specified sequence
System.out.println(s2.contains("ll")); // Output: true

// toLowerCase, toUpperCase: Converts case, returns new string
System.out.println(s2.toLowerCase()); // Output: i love programming
System.out.println(s2.toUpperCase()); // Output: I LOVE PROGRAMMING

// replace: Replaces target substring with replacement
String s3 = s2.replace("Programming", "Java");
System.out.println(s3); // Output: I love Java

// substring: Extracts substring from beginIndex to endIndex-1
String sub2 = s2.substring(2, 6);
System.out.println(sub2); // Output: love

// concatenation: Combines strings using + operator
String s4 = s1 + s2;
System.out.println(s4); // Output: abcI love Programming
```

# StringBuilder in Java

This project demonstrates the use of the `StringBuilder` class in Java, which provides a mutable alternative to the immutable `String` class for efficient string manipulation.

## Code Overview

The provided Java code showcases several `StringBuilder` methods:
- **append(String)**: Adds a string to the end of the `StringBuilder` content.
- **insert(int offset, String)**: Inserts a string at the specified index.
- **replace(int start, int end, String)**: Replaces a substring from `start` to `end-1` with a new string.
- **delete(int start, int end)**: Removes a substring from `start` to `end-1`.

The `StringBuilder` class is mutable, meaning these operations modify the existing object rather than creating new ones, making it more efficient than `String` for repeated modifications.

## Code Snippet

```
/*
 * Java StringBuilder class is used to create mutable strings.
 */
StringBuilder sb = new StringBuilder("I like Programming.");
System.out.println(sb); // Output: I like Programming.
sb.append(" Cool to code");
System.out.println(sb); // Output: I like Programming. Cool to code
sb.insert(18, ", think to solve");
System.out.println(sb); // Output: I like Programming, think to solve. Cool to code
sb.replace(2, 6, "really");
System.out.println(sb); // Output: I really Programming, think to solve. Cool to code
sb.delete(7, 19);
System.out.println(sb); // Output: I really, think to solve. Cool to code
```
# Strings and Character Arrays in Java

This project demonstrates the relationship and differences between `String` objects and character arrays in Java, showcasing how to convert between them and handle sequences of characters.

## Code Overview

The provided Java code illustrates the creation and conversion of strings and character arrays:
- A `String` object is created using a string literal.
- A character array is defined directly with individual characters.
- A `String` is converted to a character array using `toCharArray()`.
- A character array is converted to a `String` using the `String` constructor.

`String` objects are immutable and provide built-in methods for manipulation, while character arrays are mutable but lack the rich functionality of the `String` class.

## Code Snippet

```
/*
 * Both Strings and character arrays allow us to store and handle sequences of characters. But they are
 * different in some properties.
 */
String str1 = "hello";
char[] str2 = {'h', 'e', 'l', 'l', 'o'};
char[] str3 = str1.toCharArray();
String str4 = new String(str2);

// Example output
System.out.println(str1); // Output: hello
System.out.println(str2); // Output: [C@<hashcode> (array reference)
System.out.println(str3); // Output: [C@<hashcode> (array reference)
System.out.println(str4); // Output: hello
```
# Functions (Methods) in Java

This project demonstrates the use of functions (also known as methods) in Java, which are reusable blocks of code that execute when called, allowing for modular and organized programming.

## Code Overview

The provided Java code defines a `static` method called `tea()` that prints the steps to make milk tea. The method is called from the main program to execute its logic. Functions in Java can accept parameters and return values, promoting code reuse and logical separation.

## Code Snippet

```java
/*
 * Java functions (also known as methods) are blocks of code that are only executed when they are called. We
 * can pass values to methods, known as parameters, and return values from them as well. Benefits of
 * functions/methods:
 * - They allow us to divide our code in logical blocks.
 * - They allow us to reuse code.
 * Syntax:
 * void function_name(data_type parameters) {
 *     body of the function
 * }
 */
public class TeaMaker {
    public static void main(String[] args) {
        tea();
    }
    static void tea() {
        System.out.println("Boil water, tea leaves, and sugar");
        System.out.println("Add milk and boil for a few minutes");
        System.out.println("Serve the milk tea");
    }
}
```
# Parameters and Arguments in Java

This project demonstrates the use of parameters and arguments in Java methods, allowing methods to accept values when called and process them within their logic.

## Code Overview

The provided Java code defines a method `introduction` that accepts a `String` (name), an `int` (age), and a `String` array (hobbies) as parameters. These parameters are used to print a personalized introduction, including the person's name, age, and hobbies, which are iterated using a for-each loop. The method is called with corresponding arguments from the main program.

## Code Snippet

```java
/*
 * Methods can accept values while being called. These values are stored in local variables known as parameters
 * and arguments.
 * A method can have multiple or no arguments.
 * The data type of each argument must be defined in the function signature.
 */
public class Introduction {
    public static void main(String[] args) {
        String name = "Peter Parker";
        int age1 = 20;
        String[] hobbies = {"Photography", "Fighting Crime"};
        introduction(name, age1, hobbies);
    }

    static void introduction(String name, int age, String[] hobbies) {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My hobbies are: ");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
    }
}
```
# Return Types in Java

This project demonstrates the use of return types in Java methods, allowing methods to send values back to the caller. The return type must be specified in the method signature, and `void` is used when no value is returned.

## Code Overview

The provided Java code includes two methods with different return types:
- **`square(int num)`**: Returns an `int` representing the square of the input number.
- **`heroes()`**: Returns a `String` array containing a list of superhero names.
  The main program calls these methods, stores their returned values, and prints them.

## Code Snippet

```java
/*
 * Java methods can optionally return some values back to the caller using the return statement.
 * The data type of the value being returned must be specified in the method signature beforehand.
 * In case no value needs to be returned, specify the return type as void.
 * Example:
 * int square(int num) {
 *     return num * num;
 * }
 * The return type of the function is int. The function returns the square value of num.
 */
public class ReturnTypes {
    public static void main(String[] args) {
        int result3 = square(5);
        System.out.println(result3);

        String[] arr = heroes();
        for (String hero : arr) {
            System.out.println(hero);
        }
    }

    static int square(int num) {
        return num * num;
    }

    static String[] heroes() {
        String[] superheroes = {"Iron Man", "Bat Man", "Thor"};
        return superheroes;
    }
}
```
# Method Overloading in Java

This project demonstrates method overloading in Java, where multiple methods share the same name but have different parameter lists, improving code readability and flexibility.

## Code Overview

The provided Java code defines two overloaded `add` methods:
- One method accepts two `int` parameters and returns their sum.
- Another method accepts two `String` parameters and concatenates them.
  The main program calls both methods with appropriate arguments, showcasing how Java selects the correct method based on the parameter types.

## Code Snippet

```java
/*
 * Method overloading is the act of having multiple methods with the same name but different parameters.
 * It increases the readability of the program.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        add(30, 49);
        add("I'm ", "Batman");
    }

    static int add(int a, int b) {
        System.out.println("Integer arithmetic operations: ");
        return a + b;
    }

    static String add(String a, String b) {
        System.out.println("String arithmetic operations: ");
        return a + b;
    }
}
```