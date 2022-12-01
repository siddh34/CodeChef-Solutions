import java.util.Scanner;

public class NumberOfCredits {
    
    public static int getCreditScore(int noOfRTPCourses,int noOfAuditCourses,int nonAuditCourses){
        return noOfAuditCourses*2 + noOfRTPCourses*4 + nonAuditCourses*0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int noOfRTPCourses = sc.nextInt();
            int noOfAuditCourses = sc.nextInt();
            int nonAuditCourses = sc.nextInt();
            System.out.println(getCreditScore(noOfRTPCourses, noOfAuditCourses, nonAuditCourses));
            n--;
        }
        sc.close();
    }
}
