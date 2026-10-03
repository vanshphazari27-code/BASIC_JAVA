//Take a number using sc.nextLine(), then convert it into an integer using parseInt().
import java.util.Scanner;
public class parsing23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        System.out.println(n);
    }
}