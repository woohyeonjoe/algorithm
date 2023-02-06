import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        int length = num_list.length;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=length-1; i>=0; i--) {
            arr.add(num_list[i]);
        }
        
        int[] result = new int[length];
        for(int i=0; i<length; i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}