import java.util.*;
import java.io.*;


class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String[] result = new String[my_string.length()];
        int count = 0;
        for(String s : str) {
            result[count]=s.toLowerCase();
            count++;
        }

        Arrays.sort(result);

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<my_string.length(); i++) {
            sb.append(result[i]);
        }

        return sb.toString();
    }
}