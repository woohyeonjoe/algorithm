import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = n1+n2;
            System.out.println("Case #" + i + ": " + n3);
        }
    }
}