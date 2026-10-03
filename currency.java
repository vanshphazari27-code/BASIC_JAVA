public class currency {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Your amount: ");
        int amount = sc.nextInt();
         int[] curr = {500, 200, 100, 50, 20, 10, 5, 2};
         System.out.println("Currency Breakdown");
           int i = 0; 
        while (amount > 0 && i < curr.length) {
            int note = curr[i];
            
            if (amount >= note) {
                int count = amount / note;
                amount = amount % note;    
                System.out.println( note + " notes: " + count);
            }
            i++; 
        }
             if (amount > 0) {
            System.out.println("Remaining change: ₹" + amount);
        }
        
        sc.close(); 
    }
}
        
    
    

