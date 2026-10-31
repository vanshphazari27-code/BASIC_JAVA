public class Execution {
    
    static void Call(){
        // System.out.println("Last Line");
        Call2();
    }

    static void Call2(){
       
        int num = 2;
        for(int i=0;i<num;i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }
    }

    // METHOD-1
    public static void main(String[] args) {
        System.out.println("Hello");

        Call();

        for(int i=0;i<10;i++){
            Call2();
        }
        // Call2();
        System.out.println("Return");
    }


    //METHOD-2
    // public static void main(String[] args) {
    //     System.out.println("Hello");

    //     Execution obj = new Execution();
    //     obj.Call();

        // System.out.println("Return");


    
}
