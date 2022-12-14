import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompressTheVideo {
    public static int getSizeOfCompressedVideo(List<Integer> vals,int N){
        int size = 1;

        for(int j = 0; j < N - 1; j++){
            if(!vals.get(j).equals(vals.get(j+1)))
                size++;
        }

        return size;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> vals = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                vals.add(sc.nextInt());
            }

            System.out.println(getSizeOfCompressedVideo(vals,N));

            vals.clear();
        }
        
        sc.close();
    }
}
