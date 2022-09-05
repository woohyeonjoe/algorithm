import java.util.*;

public class Main{

    public static int function(int num){
        int total = 0;
        if(num == 1 || num == 0){
            return 1;
        } else {
            return total = num * function(num - 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(function(scanner.nextInt()));
    }
}