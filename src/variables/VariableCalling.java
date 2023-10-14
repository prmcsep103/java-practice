package variables;

public class VariableCalling {

    String name = "Prime";//Instance variable
    static int number = 100; // static variable

    public static void main(String[] args) {
        VariableCalling t = new VariableCalling();
        System.out.println(t.name);
        System.out.println(number);
        t.m1();
        t.m2();
        m3();

    }
    //m1 is non static method(Instance method)
    public void m1() {
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);
    }
    protected void m2(){
        System.out.println(name);
        m3();
    }
    public static void m3(){
        System.out.println(number);
    }
}
