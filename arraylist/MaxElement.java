package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();

        shop.add("Biscuits");
        shop.add("Maggie");
        shop.add("Kurkure");
        shop.add("Lays");
        shop.add("Pepsi");
        shop.add("zebra");

        System.out.println(shop);
        System.out.println(Collections.max(shop));
        System.out.println(Collections.min(shop));
        System.out.println(Collections.frequency(shop, "Pepsi"));
        System.out.println(Collections.replaceAll(shop, "Lays", "Balaji"));
        Collections.reverse(shop);
        System.out.println(shop);
        Collections.rotate(shop,2);
        System.out.println(shop);
    }
}
