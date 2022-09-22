import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int total = A*B*C;

        ArrayList<Character> arrayList = new ArrayList<>();

        String stringTotal = Integer.toString(total);
        for(int i=0; i<stringTotal.length(); i++){
            arrayList.add(stringTotal.charAt(i));
        }
        for(int i=0; i<=9; i++){
            int frequency = Collections.frequency(arrayList, Character.forDigit(i, 10));
            System.out.println(frequency);
        }
    }
}