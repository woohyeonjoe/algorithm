import java.util.*;
import java.io.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList();
        for(char c : my_string.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                arr.add((int)c-48);
            }
        }
        
        Collections.sort(arr);
        
        return arr;
    }
}