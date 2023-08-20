import java.util.Scanner;

public class ChefAndHisApartmentDues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            
            Integer A[] = new Integer[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            int maintainence = 0;
            boolean defaulted = false;
            for(int i = 0; i < N; i++){
                if(A[i] == 0) {
                    maintainence = maintainence + 1100;
                    defaulted = true;
                }
                else if(A[i] == 1 && defaulted == true){
                    maintainence += 100;
                }
            }

            System.out.println(maintainence);
        }
        sc.close();
    }
}
