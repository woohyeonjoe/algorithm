import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);

        String[] split = str.split("");
        Arrays.sort(split, Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for (String s : split) {
            sb.append(s);
        }

        Long result = Long.valueOf(sb.toString());

        return result;
    }
}