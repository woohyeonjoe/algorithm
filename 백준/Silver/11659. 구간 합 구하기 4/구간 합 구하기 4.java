import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] plusArray = new int[n+1];

        int a=0;
        for(int i=1; i<=n; i++){
            plusArray[i]=plusArray[i-1]+array[a];
            a++;
        }

        StringBuilder sb = new StringBuilder();
        for(int q=0; q<m; q++){
            st = new StringTokenizer(br.readLine());
            int i= Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int result = plusArray[j]-plusArray[i-1];

            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }
}