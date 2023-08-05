import java.util.Scanner;

public class AndrewAndTheMeatballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // List<Long> P = new ArrayList<>();
        while(T-->0){
            int N = sc.nextInt();
            long M = sc.nextInt();

            long[] P = new long[N];
            for(int i = 0; i < N; i++){
                // P.add(sc.nextLong());
                P[i] = sc.nextLong();
            }

            // sort the arraylist
            // Collections.sort(P);
            boolean notfound = true;
            long sum = 0;
            for(int i = N - 1; i >= 0; i--){
                notfound = true;
                sum += P[i];
                if(sum >= M){
                    notfound = false;
                    System.out.println(N - i);
                    break;
                }
            }

            if(notfound) System.out.println(-1);

            // P.clear();
        }
        sc.close();
    }
}
