import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt() + scanner.nextInt();
        if(m>=60) {
            h+=m/60;
            m %=60;
            if(h>23)
                h-=24;
        }


        System.out.println(h + " " + m);
    }
}