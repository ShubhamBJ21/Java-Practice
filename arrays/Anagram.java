package arrays;

//the eyes = they see

public class Anagram {
    public static void main(String[] args) {
        char[] ch1 = { 's', 'y', 'z' };
        char[] ch2 = { 'y', 's', 'z' };

        checkAnagram(ch1, ch2);
    }

    public static void checkAnagram(char[] ch1, char[] ch2) {
        if (ch1.length != ch2.length) {
            return;
        }

        int i;

        for (i = 0; i < ch1.length; i++) {
            
            int j;

            for ( j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    break;
                }
            }

            if(ch2.length == j){
                break;
            }
        }

        if(i==ch1.length){
            System.out.println("It is an anagram");
        }else{
            System.out.println("It is not anagram");
        }
    }
}
