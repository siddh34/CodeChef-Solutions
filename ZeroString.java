import java.util.Scanner;

public class ZeroString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String str = sc.next();

            int countOfZero = 0, countOfOne = 0;
            for(int i = 0; i < N;i++){
                if(str.charAt(i) == '0'){
                    countOfZero++;
                }
                else if(str.charAt(i) == '1'){
                    countOfOne++;
                }
            }

            if(countOfZero < countOfOne){
                System.out.println(1 + countOfZero);
            }
            else{
                System.out.println(countOfOne);
            }
        }
        
        sc.close();
    }
}
