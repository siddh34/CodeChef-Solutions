import java.util.Scanner;

class player{
    int scores = 0;
    boolean isServer = false;
}

public class BlobbyVolleyScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            String str = sc.next();

            player bob = new player();
            player alice = new player();

            alice.isServer = true;

            for(int i = 0; i < N; i++){
                if(str.charAt(i) == 'A' && alice.isServer == true){
                    alice.scores += 1;
                }
                else if(str.charAt(i) == 'B' && bob.isServer == true){
                    bob.scores += 1;
                }
                else if(str.charAt(i) == 'B' && alice.isServer == true){
                    bob.isServer = true;
                    alice.isServer = false;
                }
                else if(str.charAt(i) == 'A' && bob.isServer == true){
                    alice.isServer = true;
                    bob.isServer = false;
                }
            }

            System.out.println(alice.scores + " " + bob.scores);
        }
        sc.close();
    }
}
