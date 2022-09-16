import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] type = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            type[i] = scanner.nextInt();
        }

        for(int i=n; i>0; i--){
            count += k/type[i-1];
            k = k%type[i-1];
        }

        System.out.println(count);

    }
}