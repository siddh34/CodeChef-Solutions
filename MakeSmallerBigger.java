import java.math.BigInteger;
import java.util.Scanner;

public class MakeSmallerBigger {
    public static BigInteger minimumOperations(BigInteger A, BigInteger B, BigInteger X, BigInteger Y) {
        if (A.compareTo(B) >= 0) {
            return BigInteger.ZERO;
        }
        if (X.equals(BigInteger.ONE) && Y.equals(BigInteger.ONE)) {
            return BigInteger.valueOf(-1);
        }

        BigInteger n = BigInteger.ZERO;
        if (Y.compareTo(X) >= 0) {
            while (A.compareTo(B) < 0) {
                B = B.divide(Y);
                n = n.add(BigInteger.ONE);
            }
        } else {
            while (A.compareTo(B) < 0) {
                A = A.multiply(X);
                n = n.add(BigInteger.ONE);
            }
        }
        return (A.compareTo(B) >= 0) ? n : BigInteger.valueOf(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            BigInteger A = sc.nextBigInteger();
            BigInteger B = sc.nextBigInteger();
            BigInteger X = sc.nextBigInteger();
            BigInteger Y = sc.nextBigInteger();

            BigInteger operations = minimumOperations(A, B, X, Y);
            System.out.println(operations);
        }
        sc.close();
    }
}
