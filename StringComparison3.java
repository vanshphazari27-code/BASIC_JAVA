public class StringComparison3 {
    static void main(){
        String firstname = "Vansh";

        String laname = "vansh";
        if(firstname.equalsIgnoreCase(laname)){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("Both String are not equal");
        }
    }
}
