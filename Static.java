public class Static {
    static int var_1 = 11;
    int var_2 = 22;
    public static void main(String[] args) {
        System.out.println(var_1);
        
        Static obj = new Static();
        System.out.println(obj.var_2);
    }
}
