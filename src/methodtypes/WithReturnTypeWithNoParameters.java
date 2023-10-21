package methodtypes;

public class WithReturnTypeWithNoParameters {

    public static void main(String[] args) {
        int result = addition();
        System.out.println(result);
        System.out.println(addition());
        WithReturnTypeWithNoParameters obj = new WithReturnTypeWithNoParameters();
        String fullName = obj.myName();
        System.out.println(fullName);
//      NoReturnNoParameters noReturnNoParameters = new NoReturnNoParameters();
//      noReturnNoParameters.subtraction();
//      NoReturnNoParameters.addition();
        isRight();
        System.out.println(isRight());

    }

    /**
     * This is with return with no parameter method
     *
     * @return - it returns int type data - e.g here ans
     */
    public static int addition() {
        int a = 10;
        int b = 20;
        int ans = a + b;
        return ans;
    }

    public String myName() {
        String firstName = "Amit";
        String lastName = "Patel";
        return firstName + " " + lastName;
    }

    public static boolean isRight() {
        boolean a = true;
        boolean b = false;
        String course = "Java";
        int x = 100;
        if (x >= 100) {
            a = true;
        }
        return a;
    }


}
