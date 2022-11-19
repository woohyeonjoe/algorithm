import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i=1; i<=x; i++){
            int a = scanner.nextInt();
            if(a<n){
                System.out.println(a);
            }
        }

    }
}