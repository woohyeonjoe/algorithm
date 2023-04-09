import java.io.*;

class Solution {
    public String solution(String s) {
        int len = s.length();
        
        String[] str = s.split("");
        
        String result = "";
        if(len%2==0) {
            result += str[len/2-1];
            result += str[len/2];
        } else {
            result += str[len/2];
        }
        
        return result;
    }
}