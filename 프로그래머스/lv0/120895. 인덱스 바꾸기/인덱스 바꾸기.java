import java.util.*;
import java.io.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        int count = 0;
        char c1=' ';
        char c2=' ';
        
        for(char c : my_string.toCharArray()) {
            if(count==num1) c1=c;
            if(count==num2) c2=c;
            count++;
        }
        
        count = 0;
        StringBuffer sb = new StringBuffer();
        for(char c : my_string.toCharArray()) {
            if(count==num1) sb.append(c2);
            if(count==num2) sb.append(c1);
            if(count!=num1 && count!=num2) sb.append(c);
            count++;
        }
        
        return sb.toString();
    }
    
}