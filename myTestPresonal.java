public class myTestPresonal {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;

        String n = String.format("%d+%d+%d", A,B,C);

        int res = Integer.parseInt(n);

        System.out.println(res);
    }
}
