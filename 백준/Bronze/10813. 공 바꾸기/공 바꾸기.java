import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        for (int i=1; i<=n; i++) {      //0번째 인덱스를 사용x
            arr[i] = i;
        }

        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            int temp = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = temp;
        }

        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}