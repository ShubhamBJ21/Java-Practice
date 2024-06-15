package arraylist;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        
        List<String> petAnimals = new ArrayList<>();

        petAnimals.add("Dog");
        petAnimals.add("Cat");
        petAnimals.add("Ox");

        List<String> wildAnimals = new ArrayList<>();

        wildAnimals.add("Lion");
        wildAnimals.add("Wolf");
        wildAnimals.add("Fox");

        List<String> Animals = new ArrayList<>();

        Animals.addAll(petAnimals);
        Animals.addAll(wildAnimals);

        // for(String str:Animals){
        //     System.out.println(str);
        // }
        
        if(checkAnimal(Animals, "fox")){
            System.out.println("Animal is present in list");
        }else{
            System.out.println("Animal is not in list");
        }
    }

    public static boolean checkAnimal(List<String> animals, String name){
        for(int i=0; i<animals.size(); i++){
            String str  = (String)animals.get(i);

            if(str.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
