//Write a program that takes a full name containing spaces, such as 'Swaraj Patel', and stores it correctly.
import java.util.Scanner;
public class scanner18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}