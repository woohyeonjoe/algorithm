import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            String function = scanner.next();
            if(function.equals("push")){
                stack.push(scanner.nextInt());
            } else if(function.equals("pop")){
                sb.append(stack.isEmpty()? -1 : stack.pop()).append('\n');
                //System.out.println(stack.isEmpty()? -1 : stack.pop());
            } else if(function.equals("size")){
                sb.append(stack.size()).append('\n');
                //System.out.println(stack.size());
            } else if(function.equals("empty")){
                sb.append(stack.isEmpty()? 1 : 0).append('\n');
                //System.out.println(stack.isEmpty()? 1 : 0);
            } else {
                sb.append(stack.isEmpty()? -1 : stack.peek()).append('\n');
                //System.out.println(stack.peek());
            }
        }
        System.out.println(sb);
    }
}