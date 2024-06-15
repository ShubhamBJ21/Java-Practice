package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
   public static void main(String[] args) {
      List l1 = new ArrayList<>();

      l1.add(15);
      l1.add("Shubham");
      l1.add('S');
      l1.add(true);
      l1.add(15.50215);

       System.out.println(l1);
   } 
}