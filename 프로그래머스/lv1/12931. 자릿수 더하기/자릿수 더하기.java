import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        String[] arr = str.split("");
        
        int sum = 0;
        for(String s : arr) {
            sum += Integer.parseInt(s);
        }
        
        return sum;
        
        
    }
}