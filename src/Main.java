
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
    }
}

//Here Our code is wrapped under a class
/*
 *  Main method is the entry point of every java program
 *  print statement will be just print the string whatever you provide
 *  println statement will be just the string then it adds a new line character
 *  */