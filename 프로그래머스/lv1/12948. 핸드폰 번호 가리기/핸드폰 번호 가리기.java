import java.io.*;

class Solution {
    public String solution(String phone_number) {
        int temp = phone_number.length()-4;
        
        String[] str = phone_number.split("");
        
        for(int i=0; i<temp; i++) {
            str[i] = "*";
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(String s : str) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}