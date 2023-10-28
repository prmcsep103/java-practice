package polymorphism;

public class ChildClass extends ParentClass{


//    public void calculation(int a, int b){
//        System.out.println(a*b);
//        System.out.println(a-b);
//    }


    @Override
    public void calculation(int a, int b) {
        super.calculation(a, b);
    }

    @Override
    public void subtraction(int a, int b) {
        super.subtraction(a, b);
    }
}
