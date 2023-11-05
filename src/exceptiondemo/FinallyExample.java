package exceptiondemo;

public class FinallyExample {

    public static void division(){
        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("I am in catch block");
            System.out.println("Enter different number");
        }finally {
            System.out.println("I am in finally block");
        }

        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        division();
    }
}
