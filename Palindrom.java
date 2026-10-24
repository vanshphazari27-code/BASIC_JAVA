public class Palindrom {
    public static boolean isPalindrome(int num) {
        if(num<0){
            return false;
        } 

        int original = num;
        int reversed = 0;

        while(num>0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;  
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(211));
    }
}
