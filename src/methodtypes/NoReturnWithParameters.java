package methodtypes;

public class NoReturnWithParameters {

    //No return type with parameters
    public static void additon(int a, int b) {
        int answer = a + b;
        System.out.println(answer);
    }

    public static void printName(String name){
        System.out.println(name);

    }
    public void printCourse(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        additon(5,10);
        additon(100,200);
        printName("Java");
        printName("Python");

        NoReturnWithParameters t1 = new NoReturnWithParameters();
        t1.printCourse("Java script");

    }



}
