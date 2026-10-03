//Write a program that continuously accepts integers until the user enters a non-integer. Use hasNextInt().
import java.util.Scanner;
public class scanner19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.print("Enter an Number: ");
            int num = sc.nextInt();
            System.out.println("Number : "+num);
        }
        System.out.println("Invalid Input.");
    }
}