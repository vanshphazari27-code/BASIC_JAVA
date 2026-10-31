public class StringBufferExample {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" War");
        System.out.println(sb);

        sb.insert(6, "Beautiful ");
        System.out.println(sb);

        sb.replace(6, 15, "Awesome");
        System.out.println(sb);

        sb.delete(5, 13);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String finalResult = sb.toString();
        System.out.println(finalResult);
    }
}
