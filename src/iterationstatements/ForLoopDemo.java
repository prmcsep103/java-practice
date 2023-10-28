package iterationstatements;

public class ForLoopDemo {

    public static void main(String[] args) {

//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }

//        for (int i=5; i<=10; i++){
//            System.out.println(i);
//        }
         //print 10 to 1
//        for (int i=10; i>=1; i--){
//            System.out.println(i);
//        }
        //print odd number between 1 to 10 (1,3,5,7,9)
//        for (int i=1; i<=10; i++){
//            if(i%2==1){
//                System.out.println(i);
//            }
//        }
        //print even number between 1 to 20

        // print 1,2,3,6,8,9,10
        for (int i=1; i<=10; i++){

            if (i!=5 && i!=7){
                System.out.println(i);
            }else {
                System.out.println("This is not required number");
            }
        }
    }

}
