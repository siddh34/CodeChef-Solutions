import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motivation {
    List<Integer> IMDB = new ArrayList<>();
    List<Integer> Space = new ArrayList<>();

    public int maxRating(int noOfMovies,int freeSpace,Scanner sc) {
        int maxRating = 0;
        
        for(int i = 0; i < noOfMovies; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            Space.add(S);
            IMDB.add(R);
        }

        for(int i = 0; i < noOfMovies; i++) {
            if(Space.get(i) <= freeSpace){ 
                if(maxRating < IMDB.get(i)){
                    maxRating = IMDB.get(i);
                }
            }
        }

        Space.clear();
        IMDB.clear();

        return maxRating;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();                                          
        
        Motivation M = new Motivation();

        while((T--)>0){
            int noOfMovie = sc.nextInt();
            int freeSpace = sc.nextInt();

            System.out.println(M.maxRating(noOfMovie, freeSpace,sc));
        }

        sc.close();
    }
}
