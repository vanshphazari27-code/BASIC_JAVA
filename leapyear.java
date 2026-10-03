public class leapyear {
    public static void main(String[] args) {
         java.util.Scanner ac = new java.util.Scanner(System.in);
         System.out.print("Enter your desire year: ");
         int year = ac.nextInt();

         if(year%400 == 0 || (year%4==0 && year%100!=0)){
            
             System.out.printf("%d is a leap year", year);
         }
         else{
             System.out.printf("%d is not a leap year", year);
         }
       
    }
    
}
