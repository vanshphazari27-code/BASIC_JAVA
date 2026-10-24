
public class count {

    static int getLengthOfString(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "java";
        System.out.println(getLengthOfString(str));
    }
}
