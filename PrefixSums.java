import java.util.ArrayList;
import java.util.Scanner;

public class PrefixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            
            if(N == 2 || N == 0 || N % 2 != 0){
                System.out.println("NO");
            }
            else{
                int number[] = new int[N];
                for(int i = 0; i < N; i++){
                    number[i] = i+1;
                }
                int sumA = 0, sumB = 0;
                ArrayList<Integer> A = new ArrayList<>();
                ArrayList<Integer> B = new ArrayList<>();
                for(int i = 0; i < N/2; i++){
                    if(i % 2 == 0){
                        sumA += number[i];
                        A.add(number[i]);
                    }
                    else{
                        sumB += number[i];
                        B.add(number[i]);
                    }
                }

                for(int i = N/2; i < number.length; i++){
                    if(i % 2 == 0){
                        sumB += number[i];
                        B.add(number[i]);
                    }
                    else{
                        sumA += number[i];
                        A.add(number[i]);
                    }
                }

                if(sumA == sumB){
                    System.out.println("YES");
                    for(int i = 0; i < A.size(); i++){
                        System.out.print(A.get(i)+" ");
                    }
                    System.out.println();
                    for(int i = 0; i < B.size(); i++){
                        System.out.print(B.get(i)+" ");
                    }
                    System.out.println();
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
