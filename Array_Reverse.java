import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] e = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            e[i]=sc.nextInt();
        }
        System.out.println("ARRAY:");
        for(int i=0;i<e.length;i++){
            System.out.print(e[i] + " ");
        }
        
        System.out.println("REVERSE ARRAY: ");
        for(int i =n-1;i>=0;i--){
            System.out.print(e[i] + " ");
        }

        sc.close();
    }
}
