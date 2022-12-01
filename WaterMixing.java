import java.util.Scanner;

/*

Chef is setting up a perfect bath for himself. He has XX litres of hot water and YY litres of cold water.
The initial temperature of water in his bathtub is AA degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by 11 degree on mixing 11 litre of hot water.
The temperature drops by 11 degree on mixing 11 litre of cold water.
Determine whether he can set the temperature to BB degrees for a perfect bath.

Input 

A,B,X, and Y — the initial temperature of bathtub, the desired temperature of bathtub, the amount of hot water in litres, and the amount of cold water in litres respectively.

*/ 


public class WaterMixing {
    public static String isItPossible(int A,int B,int X, int Y){
        String result = "NO";

        if(A > B){
            if(A - Y <= B){
                result = "YES";
            } 
            else{
                result = "NO";
            }
        }
        else if(A < B){
            if(A + X >= B){
                result = "YES";
            }
            else{
                result = "NO";
            }
        }
        else{
            result = "YES";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(isItPossible(A, B, X, Y));
            T--;
        }

        sc.close();
    }
}
