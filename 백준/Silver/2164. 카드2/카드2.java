import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> dq = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());



        for(int i=1; i<=n; i++){
            dq.add(i);
        }

        for (;;){
            if(n == 1){
                System.out.println(1);
                break;
            }
            dq.remove();
            if(!dq.isEmpty()){
                int first = dq.removeFirst();
                dq.addLast(first);
                if(dq.size() == 1){
                    System.out.println(dq.getFirst());
                    break;
                }
            }
        }


    }
}