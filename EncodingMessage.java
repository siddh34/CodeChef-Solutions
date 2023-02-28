import java.util.Scanner;

public class EncodingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String str = sc.next();

            char[] str1 = str.toCharArray();
            if(N % 2 == 0){
                for(int i = 1; i < N; i+=2){
                    str1[i - 1] = str.charAt(i); 
                    str1[i] = str.charAt(i - 1);
                }
                String swapped = new String(str1);
                
                char[] swappedArr = swapped.toCharArray(); 
                for(int i = 0; i < swapped.length(); i++){
                    int asc = swappedArr[i];

                    int rep = (25 - asc + 2*97);

                    swappedArr[i] = (char)(rep);
                }

                String encrypted = String.valueOf(swappedArr);
                System.out.println(encrypted);
            }
            else{
                for(int i = 1; i < N - 1; i+=2){
                    str1[i - 1] = str.charAt(i);
                    str1[i] = str.charAt(i - 1);
                }
                String swapped = new String(str1);
                
                char[] swappedArr = swapped.toCharArray(); 
                for(int i = 0; i < swapped.length(); i++){
                    int asc = swappedArr[i];

                    int rep = (25 - asc + 2*97);

                    swappedArr[i] = (char)(rep);
                }

                String encrypted = String.valueOf(swappedArr);
                System.out.println(encrypted);
            }
        }
        
        sc.close();
    }
}
