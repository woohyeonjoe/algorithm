import java.util.*;

class Solution {
    public String solution(String s) {
        ArrayList<String> arr = new ArrayList<>();
        
        String[] split = s.split("");
        
        for(String str : split) {
            arr.add(str);
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        StringBuffer sb = new StringBuffer();
        for(String temp : arr) {
            sb.append(temp);
        }
        
        return sb.toString();
    }
}