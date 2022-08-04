import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x=0;
        int y=0;

        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n][2];

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0]-e2[0];
            } else {
                return e1[1]-e2[1];
            }
        });

        for(int i=0; i<n; i++){
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}