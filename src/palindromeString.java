import java.util.Scanner;

public class palindromeString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(rev.equals(str)){
            System.out.println("Ya, its palindrome");
        }else {
            System.out.println("No, its not palindrome");
        }
    }
}
