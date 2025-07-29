import java.util.Scanner;

public class sumOfPositiveNumbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            num = sc.nextInt();
            if (num > 0) {
                sum += num;
            }
        } while (num >= 0);
        System.out.println(sum);
    }
}
