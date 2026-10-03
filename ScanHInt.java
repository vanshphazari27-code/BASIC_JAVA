import java.util.Scanner;
public class ScanHInt{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter Number: ");

        if(ac.hasNextInt()){
            int num = ac.nextInt();
            System.out.println("Number is: " + num);
        }
        else{
            System.out.println("Enter Your Numbers:");
        }

        
    }
}


