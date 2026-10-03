//Convert String values "100", "10.5", "20.5f", and "50000" using parseInt(), parseDouble(), parseFloat(), and
//parseLong().
public class parsing24{
    public static void main(String[] args) {
        String n1 = "100";
        String n2 = "10.5";
        String n3 = "20.5f";
        String n4 = "50000";
        int num1 = Integer.parseInt(n1);
        double num2 = Double.parseDouble(n2);
        float num3 = Float.parseFloat(n3);
        long num4 = Long.parseLong(n4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}