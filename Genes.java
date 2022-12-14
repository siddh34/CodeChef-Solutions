import java.util.Scanner;

public class Genes {
    public static int rarity(String color) {
        int rarity = 0;

        if(color.equals("G")){
            rarity = 2;
        }
        else if(color.equals("B")){
            rarity = 1;
        }
        else if(color.equals("R")){
            rarity = 0;
        }

        return rarity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] parents = str.split(" ");
        
        if(rarity(parents[0]) == rarity(parents[1])){
            System.out.println(parents[1]);
        }
        else if(rarity(parents[1]) > rarity(parents[0])){
            System.out.println(parents[0]);
        }
        else if(rarity(parents[1]) < rarity(parents[0])){
            System.out.println(parents[1]);
        }
        
        sc.close();
    }
}
