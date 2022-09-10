import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<Integer> t = new ArrayList<>();
        int time=0;
        int total=0;
        
        for(int i=0; i<n; i++){
            t.add(scanner.nextInt());
        }
        
        Collections.sort(t);
        
        for(int i=0; i<n; i++){
            time += t.get(i);
            total += time;
        }
        
        System.out.println(total);
        
    }
}