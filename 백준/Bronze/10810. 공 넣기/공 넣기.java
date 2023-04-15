import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        for (int k=0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int lp = Integer.parseInt(st.nextToken());
            int rp = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            for (int i=lp; i<=rp; i++) {
                arr[i] = num;
            }
        }

        for (int i=1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}