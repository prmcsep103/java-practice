package exceptiondemo;

public class ArrayExceptionDemo {

    public static void main(String[] args) {
        example();
    }

    public static void example(){
        int [] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;


        try{
            System.out.println(a[5]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Use right index");
        }

        System.out.println("Hello");
    }
}
