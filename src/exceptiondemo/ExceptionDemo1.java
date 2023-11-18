package exceptiondemo;

public class ExceptionDemo1 {
    public static void division() {
        int a = 10;
        int b = 0;
        System.out.println("Hi");
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hello word");
    }
    public static void calculation() {
        division();
    }

    public static void main(String[] args)  {
        calculation();

    }

}
