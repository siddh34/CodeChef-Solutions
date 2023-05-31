import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laddu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);      
        
        // int T = sc.nextInt();
        String n = br.readLine();
        int T = Integer.parseInt(n);
        List<String> lines = new ArrayList<String>();
        while((--T) >= 0){
            String str = br.readLine();

            String[] init = str.split(" ");

            int N = Integer.parseInt(init[0]);

            for(int i = 0; i < N; i++){
                lines.add(br.readLine());
            }

            int laddus = 0;
            for(int i = 0; i < N; i++){
                String temp = lines.get(i);
                String[] arr = temp.split(" ");
                if(arr.length == 2){
                    if(arr[0].equals("CONTEST_WON")){
                        laddus += 300;
                        if(Integer.parseInt(arr[1]) <= 20){
                            laddus += (20 - Integer.parseInt(arr[1]));
                        }
                    }
                    else if(arr[0].equals("BUG_FOUND")){
                        laddus += Integer.parseInt(arr[1]);
                    }
                }
                else{
                    if(arr[0].equals("TOP_CONTRIBUTOR")){
                        laddus += 300;
                    }
                    else if(arr[0].equals("CONTEST_HOSTED")){
                        laddus += 50;
                    }
                }
            }

            int i = 0;
            if(init[1].equals("NON_INDIAN")){
                i = laddus/400;
            }
            else if(init[1].equals("INDIAN")){
                i = laddus/200;
            }

            System.out.println(i);

            lines.clear();
        }
        
        br.close();
        sc.close();
    }
}
