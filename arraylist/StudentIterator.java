package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class StudentIterator {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();

        student.add("SHUBHAM");
        student.add("RAHUL");
        student.add("AJINKYA");
        student.add("CHAITANYA");
        student.add("NAYAN");

        /*
         * Iterator<String> iterator = student.iterator();
         * 
         * while (iterator.hasNext()) {
         * System.out.println(iterator.next());
         * }
         */

        ListIterator<String> listIterator = student.listIterator();

        System.out.println("Forward Direction: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("=========================================");
        
        System.out.println("Backwrd Direction: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
