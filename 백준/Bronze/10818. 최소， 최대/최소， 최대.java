import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> number = new ArrayList<>(n);
        for(int i=1; i<=n; i++) {
            int x = scanner.nextInt();
            number.add(x);
        }
        
        System.out.println(Collections.min(number));
        System.out.println(Collections.max(number));

    }
}