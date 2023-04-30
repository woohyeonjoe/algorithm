import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i=1; i<=n; i++) {
            result.add(i);
        }


        for (int i=1; i<=m; i++) {

            st = new StringTokenizer(br.readLine());
            int le = Integer.parseInt(st.nextToken());
            int re = Integer.parseInt(st.nextToken());

            while (le < re) {
                int temp = result.get(re);
                result.set(re, result.get(le));
                result.set(le, temp);
                le++;
                re--;
            }

        }

        for (int i=1; i<=n; i++) {
            System.out.print(result.get(i) + " ");
        }


    }

}