import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TransformTheExpression {
    public static int precession(char character){
        switch(character){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;   
        }
        return -1;
    }

    public static String infixPostfix(String expr){
        String result = new String("");


        Deque<Character> stack = new ArrayDeque<Character>(); 

        for(int i = 0; i < expr.length(); i++){
            char c = expr.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precession(c) <= precession(stack.peek())){
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid expression";
            }
            result += stack.peek();
            stack.pop();
        }

        stack.clear();

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String experssion = sc.next();
            System.out.println(infixPostfix(experssion));
        }
        
        sc.close();
    }
}
