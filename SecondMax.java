import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondMax {
    
    public static void printSecondMax(List<Integer> numbers){
        Collections.sort(numbers);
        System.out.println(numbers.get(1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int n = sc.nextInt();
        while(n!=0){
            int A1 = sc.nextInt();
            numbers.add(A1);
            int A2 = sc.nextInt();
            numbers.add(A2);
            int A3 = sc.nextInt();
            numbers.add(A3);
            SecondMax.printSecondMax(numbers);
            numbers.clear();
            n--;
        }
        sc.close();
    }
}
