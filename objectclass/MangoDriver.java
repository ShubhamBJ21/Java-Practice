//Method chaining

package objectclass;

class Mango{
    String type;
    String location;
    double price;

    Mango(){

    }

    Mango showLocation(){
        System.out.println("Location: "+location);
        return this;
    }

    Mango showType(){
        System.out.println("Type: "+type);
        return this;
    }

    Mango showPrice(){
        System.out.println("Price: "+price);
        return this;
    }
}

public class MangoDriver {
    public static void main(String[] args) {
        Mango m1 = new Mango();

        m1.type = "Hapus";
        m1.location = "Devgiri";
        m1.price = 900;

        m1.showType().showLocation().showPrice();
    }
}
