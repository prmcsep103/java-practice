package methodtypes;

public class Programme2 {

    public static void main(String[] args) {
        Programme2 obj = new Programme2();
        Programme2 obj1 = getObject();
        int number = obj.m1();
        obj1.add();
        obj1.sub();
        getObject().add();
    }
    public void add(){

    }
    public void sub(){

    }
    public int m1(){
        return 10;
    }

    public static  Programme2 getObject(){
        Programme2 obj = new Programme2();
        return obj;
    }
}
