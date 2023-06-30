import java.util.Scanner;

public class TouristTranslations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        String languagesmall = sc.next();
        String languagescapital = languagesmall.toUpperCase();
        String smallletters = "abcdefghijklmnopqrstuvwxyz";
        String captialletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while((--T)>=0){
            String words = sc.next();

            for(char c : words.toCharArray()){
                if(c == '_'){
                    System.out.print(" ");
                }
                else if(c == '?' || c == '!' || c == '.' || c == ','){
                    System.out.print(c);
                }
                else{
                    int index = smallletters.indexOf(c);

                    if(index == -1){
                        index = captialletters.indexOf(c);
                        System.out.print(languagescapital.charAt(index));
                    }
                    else{
                        System.out.print(languagesmall.charAt(index));
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
