//Write a Java program that takes a user's name and age and prints them using Scanner.
import java.util.Scanner;
public class scanner16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}