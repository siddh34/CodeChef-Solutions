import java.util.Scanner;

public class HOWMANYDIGITSDOIHAVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.length() == 1){
            System.out.println(1);
        }
        else if(str.length() == 2){
            System.out.println(2);
        }
        else if(str.length() == 3){
            System.out.println(3);
        }
        else{
            System.out.println("More than 3 digits");
        }

        sc.close();
    }
}
