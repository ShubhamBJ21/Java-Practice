package arraylist;

import java.util.List;
import java.util.ArrayList;

public class FriendContactList {
    public static void main(String[] args) {
        List<String> contact = new ArrayList<>();

        contact.add("Shubham Jadhav");
        contact.add("Dipraj Patil");
        contact.add("Chaitanya Ukirade");
        contact.add("Ajinkya Ghisare");
        contact.add("Rohan Patil");
        contact.add("Aayush Jamadade");

        List<String> femaleFriends = new ArrayList<>();

        femaleFriends.add("Prajakata");
        femaleFriends.add("Mayuri");
        femaleFriends.add("Deepati");

        List<String> friends = new ArrayList<>();

        friends.addAll(contact);
        friends.addAll(femaleFriends);

        for (String str : friends) {
            System.out.println(str);
        }

        System.out.println("--------------------");

        friends.retainAll(femaleFriends);
        System.out.println(femaleFriends);


        for (String str : friends) {
            System.out.println(str);
        }
        
        System.out.println("---------------------------");

        searchFriendName(contact, "ja");
    }

    static void searchFriendName(List<String> contact, String search){

        for(String str : contact){

            if(str.toLowerCase().contains(search.toLowerCase())){
                System.out.println(str);
            }
        }
    }
}
