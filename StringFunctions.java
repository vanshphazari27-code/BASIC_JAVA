public class StringFunctions {
    static void main(){
        String str = "Vansh";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println();

        String emp = "  ";
        System.out.println(emp.isEmpty());
        System.out.println(emp.isBlank());
        System.out.println();

        String name = "  vansh  ";
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name.length());
        System.out.println();
        

        System.out.println(name.toUpperCase());
        System.out.println();


        String name1 = "Hello this is java";
        System.out.println(name1.substring(3,7));
        System.out.println(name1.contains("Hello"));
        System.out.println();


        int num = 3433;
        String var = String.valueOf(num);
        System.out.println(num + 1);
        System.out.println(var + 1);
        System.out.println();

        String s1 = "Hello Java World";
        System.out.println(s1.startsWith("Hello"));
        System.out.println(s1.endsWith("World"));
        System.out.println();

        String name2 = "Java";
        char[] cr = name2.toCharArray();

        for (char ch: cr){
            System.out.println("value : " + ch);
        }
        System.out.println();

        
        String name3 = "hello this is java site";
        System.out.println(name3.split(" "));
        String[] words = name3.split(" ");
        for(String print: words){
            System.out.println(print);
        }
        System.out.println();

        
        String name4 = "war";
        name4 = name4.replace("w","c");
        System.out.println(name4);
        System.out.println();
    }
}
