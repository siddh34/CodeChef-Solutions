import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class song{
    int length = 0;
    int language = 0;

    song(int length, int language){
        this.length = length;
        this.language = language;
    }
}

class SortByLength implements Comparator<song> {
    // Method
    // Sorting in decending order of roll number
    public int compare(song a, song b){
        return b.length - a.length;
    }
}

public class DotifyPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<song> songs = new ArrayList<song>();
        List<Integer> validLength = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();

            for(int i = 0; i < N; i++){
                songs.add(new song(sc.nextInt(), sc.nextInt()));
            }

            Collections.sort(songs,new SortByLength());

            for(song song : songs){
                if(song.language == L){
                    validLength.add(song.length);
                }
            }

            Collections.sort(validLength,Collections.reverseOrder());
            
            int totalLength = 0;
            if(validLength.size() < K){
                totalLength = -1;
            }
            else{
                for(int i = 0; i < K; i++){
                    totalLength += validLength.get(i);
                }
            }
            
            System.out.println(totalLength == 0 ? -1: totalLength);

            songs.clear();
            validLength.clear();
        }
        sc.close();
    }
}
