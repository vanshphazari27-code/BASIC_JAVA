public class Array_Functions {
    public static void main(String[] args) {
        int [] a1 = {10,20,30,40,50,60,70};
        int [] a2 = {10,20,30,40,50,60,70,80,90};
        int [] a3 = {10,20,30,40,50,60,80};

        boolean isEqual = java.util.Arrays.equals(a1,a2);
        System.out.println(isEqual);

        boolean isEqual1 = java.util.Arrays.equals(a1,a3);
        System.out.println(isEqual1);

    }
}
