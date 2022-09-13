import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr;

        String s = Integer.toString(n);

        arr = s.split("");

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}