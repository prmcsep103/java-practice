package methodtypes;

public class Programme1 {
    //With return type with no params method
    public double areaCircle(){
        double r = 16.0;
        double area = (3.14 * r * r);
        return area;
    }

    public static void main(String[] args) {
        Programme1 p = new Programme1();
        System.out.println(p.areaCircle());
    }

}
