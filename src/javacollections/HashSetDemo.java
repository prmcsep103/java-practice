package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    //HashSet declaration
    public static void main(String[] args) {
        HashSet <String> courseSet = new HashSet();
        courseSet.add("Java");
        courseSet.add("Selenium");
        courseSet.add("API");
        courseSet.add("SQL");
      //  courseSet.add("API");

        System.out.println(courseSet);

        for (String name : courseSet ){
            System.out.print(name + " ");
        }
        System.out.println(" ");

        Iterator<String> list = courseSet.iterator();
        while (list.hasNext()){
            System.out.print(list.next()+ " ");
        }
    }

}
