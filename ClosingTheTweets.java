import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosingTheTweets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String line[] = bufferReader.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        int arr[] = new int[N];
        for(int i = 0; i < K; i++){
            line = bufferReader.readLine().split(" ");

            if(line.length == 1){
                Arrays.fill(arr,0);
            }
            else{
                int number = Integer.parseInt(line[1]) - 1;

                if(arr[number] == 0){
                    arr[number] = 1;
                }
                else{
                    arr[number] = 0;
                }
            }

            int count = 0;
            for(int num: arr) if(num == 1) count++;

            System.out.println(count);
        }

        bufferReader.close();
    }
}
