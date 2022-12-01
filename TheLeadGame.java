import java.util.Scanner;

public class TheLeadGame {
    
    public static void getWinner(int[] score1,int[] score2){
        int[] arr = new int[score1.length];
        int maxIndex = -1;
        int max = -1;
        int playerInLead = -1;

        for(int i = 0; i < score1.length; i++){
            arr[i] = Math.abs(score1[i] - score2[i]);
        }
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                maxIndex = j;
            }
        }
        
        if(score1[maxIndex] > score2[maxIndex]){
            playerInLead = 1;
            System.out.println(playerInLead + " " + max);  
        }
        else{
            playerInLead = 2;
            System.out.println(playerInLead + " " + max);  
        }    
        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
		int cumScore1 = 0,cumScore2 = 0;
        
        int[] score1 = new int[T]; 
        int[] score2 = new int[T];

        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            cumScore1 += a; 
            cumScore2 += b; 
            
            score1[i] = cumScore1;
            score2[i] = cumScore2;
        }

        TheLeadGame.getWinner(score1, score2);

        sc.close();
    }
}
