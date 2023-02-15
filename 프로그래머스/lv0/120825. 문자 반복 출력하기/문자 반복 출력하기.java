class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        
        for(int i=0; i<my_string.length(); i++) {
            sb.append((c[i]+"").repeat(n));
        }
        
        return sb.toString();
    }
}