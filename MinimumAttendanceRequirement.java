import java.util.Scanner;

public class MinimumAttendanceRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String str = sc.next();

            float ones = 0;
            for(int i = 0;i < N;i++){
                if(str.charAt(i) == '1'){  
                    ones++;
                }
            }

            float val = (float) ((float) ((ones + (120 - N))/120)*100.0);

            if(val >= 75){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();
    }
}
