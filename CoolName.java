import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        List<Character> ch = new ArrayList<Character>();

        ch.add('a');
        ch.add('b');
        ch.add('c');
        ch.add('d');
        ch.add('e');
        ch.add('f');
        ch.add('g');
        ch.add('h');
        ch.add('i');
        ch.add('j');
        ch.add('k');
        ch.add('l');
        ch.add('m');
        ch.add('n');
        ch.add('o');
        ch.add('p');
        ch.add('q');
        ch.add('r');
        ch.add('s');
        ch.add('t');
        ch.add('u');
        ch.add('v');
        ch.add('w');
        ch.add('x');
        ch.add('y');
        ch.add('z');

        while((--T) >= 0){
            String S = sc.next();

            char[] name = S.toCharArray();

            Arrays.sort(name);
            int m = 0;
            for(int i = 0; i < S.length(); i++){
                for(int j = 0; j < ch.size(); j++){
                    if(ch.get(j) == name[i]){
                        m += (i + 1)*(j + 1);
                    }
                }
            }

            System.out.println(m);
        }
        
        sc.close();
    }
}
