import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsitaVOWELorCONSONANT {
    public static List<String> getVowels(){
        List<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        return vowels;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();

        List<String> myVowels = getVowels(); 

        if(myVowels.contains(str)){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
        sc.close();
    }
}
