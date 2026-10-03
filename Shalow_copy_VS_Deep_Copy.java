public class Shalow_copy_VS_Deep_Copy {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70};
        int [] Shallow_Copy = a;
        Shallow_Copy[0]=99;
        System.out.println("Shallow_Copy: " + a[0]);
        System.out.println(a);//reference id - memory block

        int [] Deep_Copy = java.util.Arrays.copyOf(a,a.length);
        Deep_Copy[0]=777;
        System.out.println("Deep_Copy: " + a[0]);
        System.out.println(a);//reference id - memory block
    }
}
