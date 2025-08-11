
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("I'm a programmer");
        System.out.println("Hello world");
        int num = 5;
        int num2 = 10;
        int num_3 = 9;

        char a = 'a';
        boolean status = true;
        String str = "I love Java";
        System.out.println("string is "+str);

//        typecasting
        int num4 = 45;
        long num5 = num4;
        long num6=1000000;
        int num7=(int)num6;

//        constant
        final double pi;
        pi = 3.1;

//        Reading Input
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Entered values is "+x);
        System.out.println(x*x);
        int byteVal = sc.nextByte();
        System.out.println("byte value is "+byteVal);
        String word = sc.next();
        System.out.println(word);
        String word2 = sc.nextLine();
        System.out.println("word s i "+word2);
        char ca = sc.next().charAt(0);

//        Arithematic operator
//        Addition
        int a1 = 10;
        int b = 20;
        System.out.println(a1+b);
//        Substraction
        int a2 = 20;
        int b2 = 3;
        System.out.println(a2-b2);
//        Division
        System.out.println(a2/b2);
        System.out.println(a2/(float)b2);
//        Multiplication
        System.out.println(a2*b2);
//        Modulo Operator - Remainder
        System.out.println((a2%b2));

//        Relational Operators
        System.out.println(a2==b2);
        System.out.println(a2>b2);
        System.out.println(a2<b2);
        System.out.println(a2>=b2);
        System.out.println(a2<=b2);
        System.out.println(a2!=b2);

//        Arithematic vs Equality operator
//        Arithematic operator assign a value to a variable
        int b4=50;
//        Equality operator check the equality btw two values
        System.out.println(a2==b4);

//        Branching - if else
        /*
        * The 'if' statement is used to test a condition. It checks boolean condition: true to false.
        * It can optionally have an else if and an else statement attached with it as well.
         */
        if(x>0){
            System.out.println("Positive number");
        } else if(x<0){
            System.out.println("Negative number");
        } else {
            System.out.println("Neutral number");
        }
        int month = sc.nextInt();
//        Switch Statement
        switch (month){
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

//        enhanced switch
        switch (month){
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

        char cha = sc.next().charAt(0);
        switch (cha){
            case 'a':
            case 'b':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");

        }

//        Ternary Operator
        /**
         * Ternary operator is condensed form of if-else statement which evalutes a condition and executes the code based on the evaluated condition.
         * result = (condition) ? expression1: expression2;
         */
        String result = num % 2 == 0 ? "even" : "odd";

//        Logical AND
        int age = 20;
        String citizenship = "Indian";
        String ans1 = age >= 18 && citizenship == "Indian" ? "You can vote" : "You can't vote";
//        Logical OR
        String ab = "Java";
        String ac = "Python";
        String result2 = ab == "Java" || ac == "Python" ? "Would be developer" : "Won't be developer";
//        Logical NOT
        boolean dd = true;
        if(!dd){
            System.out.println("hai");
        }

        /*
        For loop
        Java for loop is used to execute a block a code a certain number of times. It is recommended to use for loop when the exact number off iterations is known beforehand.
        The syntax of for loop is:
            for(initialisation;condition;update){
                body of the loop
            }
         */
        for(int j=1; j<=10; j++){
            System.out.println(j+"\n");
        }

        /*
         *  While loops
         * The Java while loops is used to execute a specific block of code until a certain condition is met.
         * The syntax of the while loop is:
         *
         * while (condition) {
         *  body of loop
         * }
         */
        int i=1;
        while (i<=10){
            System.out.println("%d"+i);
            i++;
        }

        /*
            do-while loop
            The do-while loop is very similar to the while loop. However the body of do-while loop is executed once before
            the condition is checked.
            The syntax of the do while loop is:
            do{
                body of the loop
            } while (condition);
         */
        do{
            System.out.println("hi");
            i++;
        }while (i<5);

//        Arrays
        /*
            Java array is a data structure that stores data of the same type in a sequential manner. An array takes a
            contiguous section of the memory.
         */

//        Array with initial values (size determined automatically)
        int[] arr1 = {4, 8, 9, 1, 0};
//        Empty array with size = 5. Initially all values are 0.
        int[] arr2 = new int[5];
//        Alternate declarations
        int []arr3 = new int[5];
        int arr4[] = new int[5];
        int [] arr5 = new int[5];


        for(int j = 0; j < arr2.length; j++) {
            System.out.println("arr2[" + j + "] = " + arr2[j]);
        }

//        for-each loop
        /*
            The for each loop in Java, also called as 'enhanced for loop', was introduced in Java 5. It is one of the
            alternative approaches that are used for traversing the iterable. As the name suggests, it is mainly used to
            iterate over each of the iterable elements one by one.
         */
        int[] newArr = {5, 3, 2, 4, 1};
        for (int k:newArr){
            System.out.println(k);
        }

//        String class
        /*
            The String class represents character strings. All string literals in Java programs, such as "abc", are
            implemented as instances of this class. String in Java are immutable.
         */
        String s = "hello";
        System.out.println(s);
        System.out.println(s.length());

//        Strings using new
        /*
            We can also create new strings using the new keyword. These strings do not reside in the String pool,
            instead they are created and stored in the heap memory.
         */
//        String Pool
        String s1 = "abc";
        String s2 = new String("abc");

        if(s1 == s2){
            System.out.println("This will not work");
        }
        if(s1.equals(s2)){
            System.out.println("This will work");
        }

//        String class methods
        /*
            String class offers several methods out of the box. We will be looking at some of them in this section.
         */
//        charAt: charAt method allows us to access the character at the specified index. (eg: s2.charAt(2);
//        length: The length() method returns the length of the string. (str2.length);
//        indexOf: indexOf methods returns the index of the first occurrence of the specified char or string in the given string. If it is present, then if returns -1. eg: s2.indexOf('w'), s2.indexOf('ll');
//        equals: Equals method is used to compare whether the two strings contain the same sequence of characters. eg: s2.equals(s1);
//        contains: Returns true if and only if this string contains the specified sequence of char values. eg: s2.contains("11");
//        loLowerCase, toUpperCase: Returns new strings after changing the case. Original string remains intact. eg: s2.toLowerCase(), s2.toUpperCase()
//        String s2 = "I love Programming"; String s3 = s2.replace(target: "Programming", replacement: "Java");
//        substring: Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex -1. Thus the length of the substring is endIndex-beginIndex. eg: String sub2 = str.substring(2,6);
//        concatenation: Concatenation is the process of appending one string to the end of another string. Java strings can be added by using the '+' operator. When a string is concatenated with primitive types, they are automatically typecasted to strings. When a string is concatenated with non-primitive types, the toString() on that object is called automatically. String s3 = s1 + s2;
//        StringBuilder
        /*
            Java StringBuilder class is used to create mutable
         */
        StringBuilder sb = new StringBuilder("I like Programming.");
        sb.append("Cool to code");
        sb.insert(18, ", think to solve");
        sb.replace(2,6, "relly");
        sb.delete(7,19);

//        Strings and char arrays
        /*
            Both Strings and character arrays allows us to store and handle sequences of characters. But they are
            different in some properties.
         */
        String str1 = "hello";
        char[] str2 = {'h','e','l','l','o'};
        char[] str3 = str1.toCharArray();
        String str4 = new String(str2);

//        Functions in Java
        /*
            Java functions (also known as methods) are blocks of code that are only executed whey they are called. We
            can pass values to methods, known as parameters, and return values from them as well. Benefits of
            functions/methods:
            - They allow us to divide our code in logical blocks.
            - They allow us to reuse code.
            syntax:
            void function_name(data_type parameters){
                body of the function
            }
         */
        tea();

//        Parameters and Arguments
        /*
            Methods can accept values while being called. These values are stored in local variables known as parameters
            and arguments.
            A method can have multiples or none arguments
            The data type of each argument must be defined in the function signature.
         */
        String name = "Peter Parker";
        int age1 = 20;
        String[] hobbies = {"Photography", "Fighting Crime"};
        introduction(name, age1, hobbies);

//        Return Types
        /*
            - Java methods can optionally return some values back to the caller using the return statement.
            - The data type of the value being returned must be specified in the method signature beforehand.
            - In case no value needs to be returned, specify the return type as void.
            int square(int num) {
                return num * num;
            }
            The return type of the function is int. The function returns the square value of num.
         */
        int result3 = square(5);
        System.out.println(result3);
        String[] arr = heroes();
        for (String hero : arr){
            System.out.println(hero);
        }

//        Method Overloading
        /*
            Method overloading is the act of having multiple methods having same name but different parameters.
            It increases the readability of the program.
         */
        add(30,49);
        add("I'm ", "Batman");

//        Call Stack
        /*
            The call stack is what a program uses to keep track of method calls. The call stack is made up of stack
            -one for each method call.
         */
        first();

//        Scope of Variable
        /*
            The scope of a variable is the region of the program where it is accessible.
            There are two types of scope levels in Java
            - Class level scope (covered later on in OOPS section)
            - Block level scope.
         */

//        Variable Arguments - varargs
        /*
            In Java, an argument of a method can accept arbitrary number of values. This argument that can accept
            variable number of values is called varargs.
            Syntax:
                return type methodName(dataType... args) {
                  body
                }

         */

        float avg1 = getAvg(2,3,44,90,4,51);
        float avg2 = getAvg(3,44,2);

//        2D Arrays - Introduction
        /*
         * Java 2D Arrays are simply arrays or arrays.
         * Each element in an array itself.
         * These can be used to store matrices or grids.
         */
        int [][] well2 = {
                {6,3,5},
                {3,-2,0}
        };
        System.out.println(well2[0][1]);
        //    Create 2D arrays
        int rows = 3;
        int cols = 4;
        int[][] arr2d = new int[rows][cols];
        arr2d[1][2] = 20;

        System.out.println(arr2d[1][2]);

//        Iterating over 2D Arrays
        /*
            To iterate over 2D Arrays, we would be using nested loops.
            The outer loop will be used to iterate over the rows and the
            inner loop will be used to iterate over the columns.
         */

        int arr2dd[][] = {
                { 2, 56, 3, -9, 44},
                { 33, 4, -50, 22},
                {34, -8},
                {22, 3,-7,21}
        };

        for(int z=0; z< arr2dd.length; z++){
            for(int y=0; y< arr2dd.length; y++){
                System.out.println(arr2dd[x][y]);
            }
        }
    }
    static void tea(){
        System.out.println("Boil water tea leaves and sugar");
        System.out.println("Add milk and boil for a few minutes");
        System.out.println("Serve the milk tea");
    }

    static void introduction(String name, int age, String[] hobbies){
        System.out.println("My name is " + name);
        System.out.println("I am"+age +" years old");
        System.out.println("My hobbies are: ");
        for (String hobby: hobbies){
            System.out.println("- "+ hobby);
        }
    }

    static int square(int num){
        return num*num;
    }

    static String[] heroes(){
        String[] superheroes = {"Iron Man", "Bat Man", "Thor"};
        return superheroes;
    }

    static int add(int a, int b){
        System.out.println("Integer arithematic operations: ");
        return a+b;
    }

    static String add(String a, String b){
        System.out.println("String arithametic operations: ");
        return a+b;
    }

    static void first(){
        int x = 0;
        System.out.println("Within first function "+x);
        second();
    }

    static void second(){
        int x = 10;
        System.out.println("Within second function "+x);
        third();
    }

    static void third(){
        int x = 30;
        System.out.println("Within third function "+x);
    }

    static  float getAvg(float... varargs){
        float total = 0;

        for (float num: varargs){
            total += num;
        }

        return total / varargs.length;
    }


}

//Here Our code is wrapped under a class
/*
 *  Main method is the entry point of every java program
 *  print statement will be just print the string whatever you provide
 *  println statement will be just the string then it adds a new line character
 *  */
