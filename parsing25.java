//Write a program using try-catch that prints Valid Number for numeric input and Invalid Number for invalid
//input. Use NumberFormatException.
import java.util.Scanner;
public class parsing25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String str = sc.nextLine();
        try {
            int n = Integer.parseInt(str);
            System.out.println(n+" is Valid Number");
        } catch (Exception e) {
            System.out.println("Invalid Number");
        }
    }
}