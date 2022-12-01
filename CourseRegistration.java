import java.util.Scanner;

class CheckTheRegistration{
    int numberOfStudents;
    int capacity;
    int alreadyRegistered;

    CheckTheRegistration(int nos,int c,int ar){
        this.numberOfStudents = nos;
        this.capacity = c;
        this.alreadyRegistered = ar;
    }

    public boolean canRegister(){
        if(this.capacity - this.alreadyRegistered <= this.numberOfStudents){
            return false;
        }
        return true;
    } 
}


public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int numberOfStudents = sc.nextInt();
            int capacity = sc.nextInt();
            int alreadyRegistered = sc.nextInt();
            CheckTheRegistration CTR = new CheckTheRegistration(numberOfStudents,capacity,alreadyRegistered);
            if(CTR.canRegister()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            n--;
        }
        sc.close();
    }
}
