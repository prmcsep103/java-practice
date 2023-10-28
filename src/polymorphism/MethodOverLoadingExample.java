package polymorphism;

/**
 * Compiletime polymorphism
 * Early binding
 * Static binding
 */
public class MethodOverLoadingExample {
    /**
     * 1. different data type
     * 2. different number of arguments/parameters
     * 3. different squence of arguments
     */

    public void m1(int a){

    }
    public void m1(String name){

    }
    public void m1(String name,int a){

    }
    public void m1(int a, String name){

    }

    public void addition(int a, int b){

    }

    public void addition(int a, int b, int c){

    }


}
