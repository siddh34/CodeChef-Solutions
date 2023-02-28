import java.util.Scanner;

public class EventualReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            StringBuilder str = new StringBuilder(sc.next().substring(0,N));
            int count;
            boolean isEmpty = true;
            for(int i = 0; i < N; i++){
                count = 1;
                for(int j = 0; j < N; j++){
                    if(i!=j){
                        if(str.charAt(i) == str.charAt(j)){
                            count++;
                            str.deleteCharAt(j);
                            j--;
                            N--;
                        }
                    }
                }
                if(str.length() == 0){
                    break;
                }


                if(count % 2 != 0){
                    isEmpty = false;
                }
                else{
                    str.deleteCharAt(i);
                    i--;
                    N--;
                }
            }

            if(isEmpty){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
