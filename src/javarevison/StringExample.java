package javarevison;

/**
 * Created by Jay Vaghani
 */
public class StringExample {
    public static void main(String[] args) {
        String monthAndYear = "25 May 2024";
        String[] monAndYer = monthAndYear.split(" ");
        String day = monAndYer[0];
        String month = monAndYer[1];
        String year = monAndYer[2];
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(monthAndYear.contains("20"));
    }
}
