import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    int temp = nums[i]+nums[j]+nums[k];
                    if(temp <= M){
                        result.add(temp);
                    }
                }
            }
        }
        System.out.println(Collections.max(result));
    }
}