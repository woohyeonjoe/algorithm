class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        
        for(int j=0; j<my_string.length(); j++) {
            for(int i=0; i<n; i++) {
                sb.append(c[j]);
            }
        }
        
        return sb.toString();
    }
}