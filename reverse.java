public class reverse {
    public static int rvs(int num) {
        int rev = 0;
        while(num!=0){
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(rvs(1234));
        System.out.println(rvs(5689));
    }
}
