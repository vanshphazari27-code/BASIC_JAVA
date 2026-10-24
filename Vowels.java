public class Vowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        String lowerStr = str.toLowerCase();

        for(int i=0;i<lowerStr.length();i++){
            char ch = lowerStr.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
