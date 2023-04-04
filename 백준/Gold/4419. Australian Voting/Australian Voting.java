import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] name = new String[n];

        for(int i=0; i<n; i++){
            name[i] = br.readLine();
        }
        String input = "";
        Queue<Integer>[] score = new LinkedList[1001];
        int count = 0;
        int[] v = new int[1001];
        while((input = br.readLine()) != null && input.length() != 0){
            String[] arr = input.split(" ");
            score[count] = new LinkedList<>();
            for(int i=0; i<n; i++){
                score[count].add(Integer.parseInt(arr[i])-1);
            }
            count ++;
        }
        while(true){
            for(int i=0; i<count; i++){
                while(v[score[i].peek()] == -1){
                    score[i].poll();
                }
                v[score[i].peek()] ++;
            }
            int maxi = 0, mini = 123456789;
            for(int i=0; i<n; i++){
                maxi = Math.max(maxi,v[i]);
                if(v[i] != -1){
                    mini = Math.min(mini,v[i]);
                }
            }

            if(maxi*2 > count || maxi == mini){
                for(int i=0; i<n; i++){
                    if(v[i] == maxi){
                        System.out.println(name[i]);
                    }
                }
                return;
            }
            for(int i=0; i<n; i++){
                if(v[i] == mini){
                    v[i] = -1;
                }
                else if(v[i] != -1){
                    v[i] = 0;
                }
            }
        }
    }
}