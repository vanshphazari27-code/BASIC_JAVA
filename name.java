public class name {
    public static void main(String[] args) {
        java.util.Scanner ac = new java.util.Scanner(System.in);
        System.out.print("Enter Your first name: ");
        String first_name = ac.next();
        System.out.print("Enter your last name: ");
        String last_name = ac.next();

        String result = String.format("Your full name is : %s %S", first_name,last_name);
        System.out.println( result);
    }
    
}
