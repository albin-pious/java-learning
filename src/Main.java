
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
    }
}

//Here Our code is wrapped under a class
/*
 *  Main method is the entry point of every java program
 *  print statement will be just print the string whatever you provide
 *  println statement will be just the string then it adds a new line character
 *  */