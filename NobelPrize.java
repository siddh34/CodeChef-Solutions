import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class NobelPrize {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        HashSet<Integer> topic = new HashSet<Integer>();

        while((--T)>=0){
            String ip[] = br.readLine().split(" ");
            int N = Integer.parseInt(ip[0]);
            int X = Integer.parseInt(ip[1]);

            String givenTopics[] = br.readLine().split(" ");

            for(int i = 0; i < N; i++){
                topic.add(Integer.parseInt(givenTopics[i]));
            }

            if(X - topic.size() != 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            topic.clear();
        }
        
        br.close();
    }
}
