import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long result = 0;
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        for(int i=min; i<=max; i++) {
            result += i;
        }
        
        return result;
    }
}