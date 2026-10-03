//Take String price = "499.99", convert it into double, and add 50.
public class parsing22{
    public static void main(String[] args) {
        String price = "499.99";
        double d = Double.parseDouble(price);
        System.out.println("Add 50 into price: "+(d+50));
    }
}