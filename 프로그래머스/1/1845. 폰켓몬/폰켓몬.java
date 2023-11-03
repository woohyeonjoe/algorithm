import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int selectNum = nums.length / 2;
        
        HashSet hashSet = new HashSet();
        for(int num : nums) {
            hashSet.add(num);    
        }
        
        if(selectNum > hashSet.size()) return hashSet.size();
        else return selectNum;
        
    }
}