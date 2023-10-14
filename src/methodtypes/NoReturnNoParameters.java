package methodtypes;

public class NoReturnNoParameters {


    public static void main(String[] args) {
      addition();
      NoReturnNoParameters obj = new NoReturnNoParameters();
      obj.subtraction();
    }
    //No return No params
    public static void addition(){
        int a = 5;
        int b = 10;
        int ans  = a + b;
        //Concatenation
        System.out.println("Additon of two numbers "+ a + " and "+ b + " is : "+ ans);
    }

    public void subtraction(){
        int a = 5;
        int b = 10;
        int ans  = b - a;
        //Concatenation
        System.out.println("Subtraction of two numbers "+ b + " and "+ a + " is : "+ ans);
    }



}
