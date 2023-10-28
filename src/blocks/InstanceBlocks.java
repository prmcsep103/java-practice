package blocks;

public class InstanceBlocks {
    String eName;

    //Instance block
    {
        System.out.println("I am in instance block");
        eName = "Vijay";
    }
    public InstanceBlocks(){
        System.out.println("I am in constructor");
    }
    public static void main(String[] args) {
        InstanceBlocks obj = new InstanceBlocks();
    }
}
