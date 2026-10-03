public class electricbill {
    public static void main(String[] args) {
        java.util.Scanner ac = new java.util.Scanner(System.in);
        System.out.print("Enter yor unit bill: ");
        int bill = ac.nextInt();
        int amount;
         if(bill <= 100){
            amount = bill * 5;
         }
         else if(bill <= 200){
            amount = bill * 7;
         }
         else {
            amount = bill * 10;
         }
         System.out.println(" Your  Total Electricity  Bill = " + amount);
    }
    
}
