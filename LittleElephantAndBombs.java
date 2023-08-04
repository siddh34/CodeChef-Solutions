import java.util.Scanner;

public class LittleElephantAndBombs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int totalBuilding = sc.nextInt();
            String building = sc.next();

            int savedBuildings = 0;
            if(totalBuilding == 1){
                if(building.charAt(0) == '0'){
                    savedBuildings++;
                }
            }
            else {
                char[] arr = building.toCharArray();

                for(int i = 0, j = i - 2; i < arr.length - 1; i++){
                    if(arr[i] == '1'){
                        j = i;
                    } else if(arr[i + 1] == '0' && j != i - 1){
                        savedBuildings++;
                    }
                }

                int lastindex = arr.length - 1;
                if(arr[lastindex] == '0' && arr[lastindex - 1] == '0'){
                    savedBuildings++;
                }
            }
            System.out.println(savedBuildings);
        }
        sc.close();
    }
}
