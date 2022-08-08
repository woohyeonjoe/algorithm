import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> a = new ArrayList<>();


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a.add(Double.parseDouble(st.nextToken()));
        }

        double m = Collections.max(a);

        ArrayList<Double> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            result.add(a.get(i)/m*100);
        }

        double total=0;
        for(int i=0; i<n; i++){
            total+=result.get(i);
        }

        System.out.println(total/n);

    }
}