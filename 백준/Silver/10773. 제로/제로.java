import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<num; i++) {
            int temp = scanner.nextInt();
            if(temp == 0){
                stack.pop();
            } else{
                stack.push(temp);
            }

        }

        int total = 0;
        for(int i=0; i<stack.size(); i++){
            total += stack.get(i);
        }

        System.out.println(total);

    }
}