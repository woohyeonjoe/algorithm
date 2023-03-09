class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        
        StringBuffer sb = new StringBuffer();
        for(String s : str) {
            if(!sb.toString().contains(s)) sb.append(s);
        }
        
        return sb.toString();
    }
}