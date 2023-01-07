import java.util.Scanner;

public class FindTheDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            int num = 0;
            String res = "";
            for(int i = 0; i <= X; i++){
                if(i % 4 == 0){
                    num = 0;
                }
                if(num == 0){
                    res = "North";
                }
                else if(num == 1){
                    res = "East";
                }
                else if(num == 2){
                    res = "South";
                }
                else if(num == 3){
                    res = "West";
                }

                num++;
            }

            System.out.println(res);
        }
        
        sc.close();
    }
}
