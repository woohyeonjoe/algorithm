import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int total = 0;
        int max = 0;

        if(a == b && b == c && a == c){
            total = 10000+(a*1000);
        } else if(a == b){
            total = 1000+(a*100);
        } else if(b == c){
            total = 1000+(b*100);
        } else if(a == c){
            total = 1000+(c*100);
        } else {
            if(a>b && a>c){
                max = a;
            } else if(b>c && b>a){
                max = b;
            } else {
                max = c;
            }
            total = max*100;
        }

        System.out.println(total);
    }
}