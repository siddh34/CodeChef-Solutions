import java.util.Scanner;

public class PlayingWithMatches {
    public static int numberOfSticks(int sum){
        int numberOfSticks = 0;
        String n = Integer.toString(sum);
        int count = n.length();
        int numb = sum,digit;
        while(count != 0){
            digit = numb % 10;
            if(digit == 0){
                numberOfSticks += 6;
            }
            else if(digit == 1){
                numberOfSticks += 2;
            }
            else if(digit == 2 || digit == 3){
                numberOfSticks += 5;
            }
            else if(digit == 4 || digit == 5 || digit == 6){
                numberOfSticks += digit;
            }
            else if(digit == 7){
                numberOfSticks += 3;
            }
            else if(digit == 8){
                numberOfSticks += 7;
            }
            else if(digit == 9){
                numberOfSticks += 6;
            }
            numb = numb / 10;
            count--;
        }

        return numberOfSticks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(numberOfSticks(A+B));
        }
        
        sc.close();
    }
}
