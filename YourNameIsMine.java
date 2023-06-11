import java.util.Scanner;

public class YourNameIsMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            String M = sc.next();
            String F = sc.next();

            int l1 = M.length();
            int l2 = F.length();

            int max = Math.max(l1,l2);
            boolean shouldMarry = true;

            if(M.equals(F)){
                System.out.println("YES");
            }
            else{
                if(max == l1){
                    int lastIndex = 0;
                    for(int i = 0; i < l2; i++){
                        char ch = F.charAt(i);
                        int index = M.indexOf(ch,lastIndex);
                        if(index == -1){
                            shouldMarry = false;
                            break;
                        }
                        else{
                            lastIndex = index + 1;
                        }
                    }
                }
                else{
                    int lastIndex = 0;
                    for(int i = 0; i < l1; i++){
                        char ch = M.charAt(i);
                        int index = F.indexOf(ch,lastIndex);
                        if(index == -1){
                            shouldMarry = false;
                            break;
                        }
                        else{
                            lastIndex = index + 1;
                        }
                    }
                }

                if(shouldMarry){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
        
        sc.close();
    }
}
