public class printf {
    public static void main(String[] args) {
        java.util.Scanner ac = new java.util.Scanner(System.in);
        System.out.print("Enter Your first name: ");
        String first_name = ac.next();
        System.out.print("Enter your last name: ");
        String last_name = ac.next();

        System.out.printf("Your fist name: %s%n", first_name);
        System.out.printf("Your last name: %s", last_name);
    }
    
}
