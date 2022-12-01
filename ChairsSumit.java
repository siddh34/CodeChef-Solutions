import java.util.Scanner;

public class ChairsSumit{
    
    public static void printDiff(int chefChairs,int studentsInClass){
        if(chefChairs > studentsInClass){
            System.out.println(0);
        }
        else{
            System.out.println(studentsInClass - chefChairs);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int noOfStudents = sc.nextInt();
            int chefChairs = sc.nextInt();
            ChairsSumit.printDiff(chefChairs, noOfStudents);
            n--;
        }
        sc.close();
    }
}
