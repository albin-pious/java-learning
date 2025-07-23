import java.util.Scanner;
public class Calculator {
    public static void main(String  []args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextInt();
        int t = sc.nextInt();
        double pi = (p*r*t)/100;
        System.out.println("simple interest find successfully. "+pi);
    }
}
