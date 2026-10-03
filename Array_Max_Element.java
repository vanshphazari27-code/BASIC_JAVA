import java.util.Scanner;

public class Array_Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n1 = sc.nextInt();
        int max;
        int [] a4 = new int[n1];
        for(int i=0;i<a4.length;i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            a4[i]=sc.nextInt();
        }
        System.out.println("ARRAY:");
        for(int i=0;i<a4.length;i++){
            System.out.print(a4[i] + " ");
        }

        max=a4[0];
        for(int i = 1;i<a4.length;i++){
            if(a4[i]>max){
                max=a4[i];
            }
        }
        System.out.println("Max Element is: " + max);

        sc.close();
    }
}
