import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i : arr) {
            if(i % divisor == 0) arrList.add(i);
        }
        
        Collections.sort(arrList);
        
        if(arrList.size() == 0) arrList.add(-1);
        
        return arrList;
        
    }
}