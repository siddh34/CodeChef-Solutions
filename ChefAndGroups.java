import java.util.Scanner;

public class ChefAndGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String s = sc.next();
            s = s + "0";
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '1'){
                    for(int k = j; k < s.length();k++){
                        if(s.charAt(k) == '1'){
                            continue;
                        }
                        else{
                            count++;
                            j = k;
                            break;
                        }
                    }
                }
                else{
                    continue;
                }
            }

            System.out.println(count);
        }


        sc.close();
    }
}
