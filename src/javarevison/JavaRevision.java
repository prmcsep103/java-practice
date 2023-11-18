package javarevison;

/**
 * Created by Jay Vaghani
 */
public class JavaRevision {

    String name;
    int value;

    public JavaRevision() {
        System.out.println("No args cons");
    }

    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setValue(int value){
        this.value = value;
    }

    public JavaRevision getInstance(){
        return new JavaRevision();
    }

    public JavaRevision getInstance(String name, int Value){
        return new JavaRevision(name, value);
    }

    @Override
    public String toString() {
        return "My name " + this.name;
    }

    public static void main(String[] args) {
        JavaRevision obj = new JavaRevision("Prime", 20);
        System.out.println(obj);

//        System.out.println(obj.getName());
//        System.out.println(obj.getValue());
    }
}
