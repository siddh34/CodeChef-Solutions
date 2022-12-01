import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvoidSquares {
    List<Integer> notSquare = new ArrayList<Integer>();
    List<Integer> square = new ArrayList<Integer>();

    public void readyTheSquareList(int n){
        for(int i = 1; i <= n; i++){
            square.add(i*i);
        }
    }
    
    public void getTheSeries(int n){
        notSquare.add(n);
        readyTheSquareList(n);
        int i = 0;
        while(n!=1){
            n--;
            if(!square.contains(notSquare.get(i)*n)){
                notSquare.add(n);
                i++;
            }
        }
        printTheSeries(notSquare);
    }

    public void printTheSeries(List<Integer> ns){
        for(int i: ns){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            AvoidSquares AS = new AvoidSquares();
            int n = sc.nextInt();
            AS.getTheSeries(n);
            T--;
        }
        
        sc.close();
    }
}
