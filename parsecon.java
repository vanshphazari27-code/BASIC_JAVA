// public class parsecon {

//     public static void main(String[] args) {

//         String intStr = "676";
//         String longStr = "157876766";
//         String shortStr = "9000";
//         String byteStr = "87";
//         String floatStr = "45.5";
//         String doubleStr = "99.99";
//         String booleanStr = "true";
//         String charStr = "Aman";


//         int intValue = Integer.parseInt(intStr);

//         long longValue = Long.parseLong(longStr);

//         short shortValue = Short.parseShort(shortStr);

//         byte byteValue = Byte.parseByte(byteStr);

//         float floatValue = Float.parseFloat(floatStr);

//         double doubleValue = Double.parseDouble(doubleStr);

//         boolean booleanValue = Boolean.parseBoolean(booleanStr);

//         char charValue = charStr.charAt(0);


//         System.out.println("int     = " + intValue);
//         System.out.println("long    = " + longValue);
//         System.out.println("short   = " + shortValue);
//         System.out.println("byte    = " + byteValue);
//         System.out.println("float   = " + floatValue);
//         System.out.println("double  = " + doubleValue);
//         System.out.println("boolean = " + booleanValue);
//         System.out.println("char    = " + charValue);
//     }
// }


public class parsecon {

    public static void main(String[] args) {
        java.util.Scanner ac = new java.util.Scanner(System.in);
        System.out.print("Enter integer: ");
        String intStr = ac.nextLine();
        System.out.print("Enter long: ");
        String longStr = ac.nextLine();
        System.out.print("Enter short: ");
        String shortStr = ac.nextLine();
        System.out.print("Enter byte: ");
        String byteStr = ac.nextLine();
        System.out.print("Enter float: ");
        String floatStr = ac.nextLine();
        System.out.print("Enter double: ");
        String doubleStr = ac.nextLine();
        System.out.print("Enter boolean: ");
        String booleanStr = ac.nextLine();
        System.out.print("Enter char: ");
        String charStr = ac.nextLine();

        System.out.println("--------------------------");

        int intValue = Integer.parseInt(intStr);

        long longValue = Long.parseLong(longStr);

        short shortValue = Short.parseShort(shortStr);

        byte byteValue = Byte.parseByte(byteStr);

        float floatValue = Float.parseFloat(floatStr);

        double doubleValue = Double.parseDouble(doubleStr);

        boolean booleanValue = Boolean.parseBoolean(booleanStr);

        char charValue = charStr.charAt(0);


        System.out.println("int     = " + intValue);
        System.out.println("long    = " + longValue);
        System.out.println("short   = " + shortValue);
        System.out.println("byte    = " + byteValue);
        System.out.println("float   = " + floatValue);
        System.out.println("double  = " + doubleValue);
        System.out.println("boolean = " + booleanValue);
        System.out.println("char    = " + charValue);
    }
}
