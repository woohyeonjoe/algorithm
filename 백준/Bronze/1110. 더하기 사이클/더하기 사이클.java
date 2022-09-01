import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String stringNumber;

        if(n < 10){
            stringNumber = "0" + Integer.toString(n);
        } else{
            stringNumber = Integer.toString(n);
        }

        int cycle = 0;
        String total = stringNumber;
        for(;;){
            int tempNum = Integer.parseInt(total);

            int n1 = tempNum/10;  //10의 자리
            int n2 = tempNum%10;  //1의 자리

            int result = n1+n2;
            total = Integer.toString(n2)+Integer.toString(result%10);

            cycle+=1;

            if(total.equals(stringNumber)){
                System.out.println(stringNumber.equals("0") ? "1" : cycle);
                break;
            }
        }


    }
}