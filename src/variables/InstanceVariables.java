package variables;

public class InstanceVariables {
    /**
     * Instance - object
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */

    int a = 10; // a is a Instance or Global variable
    String name = "Prime Testing"; // name is a Instance or global variable

    public static void main(String[] args) {
      InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

    public void myMethod(){
        InstanceVariables v1 = new InstanceVariables();
        System.out.println(v1.a);
        System.out.println(v1.name);
    }

}
