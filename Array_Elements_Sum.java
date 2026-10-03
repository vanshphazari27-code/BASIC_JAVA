import java.util.Scanner;

public class Array_Elements_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int sum=0;
        int [] e = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            e[i]=sc.nextInt();
        }
        System.out.println("ARRAY:");
        for(int i=0;i<e.length;i++){
            System.out.print(e[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<e.length;i++){
            sum = sum + e[i];
        }
        System.out.println("SUM: "+sum);

        sc.close();
    }
}
