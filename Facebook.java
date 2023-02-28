import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> comments = new ArrayList<Integer>();
        List<Integer> likes = new ArrayList<Integer>();


        while((--T) >= 0){
            int N = sc.nextInt();

            int k = 0;
            for(int i = 0; i < N; i++){
                k = sc.nextInt();
                likes.add(k);
            }

            for(int i = 0; i < N; i++){
                comments.add(sc.nextInt());
            }

            int index = 0;
            int maxLikes = 0;
            int maxComments = 0;

            for(int i = 0; i < N; i++){
                if(likes.get(i) > maxLikes || (likes.get(i) == maxLikes && maxComments < comments.get(i))){
                    index = i;
                    maxLikes = likes.get(i);
                    maxComments = comments.get(i);
                }
            }

            System.out.println(index + 1);

            likes.clear();
            comments.clear();
        }
        
        sc.close();
    }
}
