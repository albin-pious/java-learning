
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

    }
}

//Here Our code is wrapped under a class
/*
 *  Main method is the entry point of every java program
 *  print statement will be just print the string whatever you provide
 *  println statement will be just the string then it adds a new line character
 *  */