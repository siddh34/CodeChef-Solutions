// Imports 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*

Chef is given 33 integers A, B,A,B, and CC such that A \lt B \lt CA<B<C.

Chef needs to find the value of max(A, B, C) - min(A, B, C)max(A,B,C)−min(A,B,C).

Here max(A, B, C)max(A,B,C) denotes the maximum value among A, B, CA,B,C while min(A, B, C)min(A,B,C) denotes the minimum value among A, B, CA,B,C.

*/ 


public class MaxMinusMin {

    public static void findMaxMinusMin(List<Integer> listOfNumbers){
        Collections.sort(listOfNumbers);
        int diff =  listOfNumbers.get(listOfNumbers.size() - 1) - listOfNumbers.get(0);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        int n = sc.nextInt();
        while(n!=0){
            int A = sc.nextInt();
            numbers.add(A);
            int B = sc.nextInt();
            numbers.add(B);
            int C = sc.nextInt();
            numbers.add(C);
            MaxMinusMin.findMaxMinusMin(numbers);
            numbers.clear();
            n--;
        }
        sc.close();
    }
}
