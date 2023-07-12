import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndCardGame {
    public static long sumDigits(long n){
        long temp = n;

        long sum = 0;
        while(temp>0){
            long rem = temp % 10;
            sum += rem;
            temp = temp / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Long> chef = new ArrayList<Long>();
        List<Long> morty = new ArrayList<Long>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                chef.add(sc.nextLong());
                morty.add(sc.nextLong()); 
            }

            long chefScore = 0;
            long mortyScore = 0;
            long chefWon = 0;
            long mortyWon = 0;

            for(int i=0; i<N; i++){
                chefScore = sumDigits(chef.get(i));
                mortyScore = sumDigits(morty.get(i));

                if(chefScore > mortyScore){
                    chefWon++;
                }
                else if(mortyScore > chefScore){
                    mortyWon++;
                }
                else{
                    mortyWon++;
                    chefWon++;
                }
            }

            if(chefWon > mortyWon){
                System.out.println("0 " + chefWon);
            }
            else if(mortyWon > chefWon){
                System.out.println("1 " + mortyWon);
            }
            else{
                System.out.println("2 "+ chefWon);
            }

            chef.clear();
            morty.clear();
        }
        
        sc.close();
    }
}
