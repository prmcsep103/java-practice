package polymorphism;

public class ParentClass {

    public void calculation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
    }

    private void addition(int a, int b){
        System.out.println(a+b);
    }
    public void subtraction(int a, int b){
        System.out.println(a-b);
    }

}
