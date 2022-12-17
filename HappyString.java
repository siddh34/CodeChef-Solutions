import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyString {
    public static List<Character> getVowels(){
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }

    public static boolean isHappy(String str){
        boolean result = false;
        List<Integer> list = new ArrayList<>();
        List<Character> vowels = getVowels();

        for(int i=0; i<str.length(); i++){
            if(vowels.contains(str.charAt(i))){
                list.add(1);
            }
            else{
                list.add(0);
            }
        }

        for(int i=0; i<list.size() - 2; i++){
            if(list.get(i) == 1 && list.get(i+1) == 1 && list.get(i+2) == 1){
                result = true;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String str = sc.next();
            if(isHappy(str)){
                System.out.println("HAPPY");
            }
            else{
                System.out.println("SAD");
            }
        }
        
        sc.close();
    }
    
}