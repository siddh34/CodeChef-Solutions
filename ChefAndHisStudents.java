import java.util.Scanner;

public class ChefAndHisStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String activities = sc.next();
            

            char[] teacherArrivedConfiguration = new char[activities.length()];

            // changing configuration
            for(int i = 0; i < activities.length(); i++){
                if(activities.charAt(i) == '<'){
                    teacherArrivedConfiguration[i] = '>';
                }
                else if(activities.charAt(i) == '>'){
                    teacherArrivedConfiguration[i] = '<';
                }
                else{
                    teacherArrivedConfiguration[i] = activities.charAt(i);
                }
            }

            int count = 0;
            for(int i = 0; i < activities.length() - 1; i++){
                if(teacherArrivedConfiguration[i] == '>' && teacherArrivedConfiguration[i + 1] == '<'){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
