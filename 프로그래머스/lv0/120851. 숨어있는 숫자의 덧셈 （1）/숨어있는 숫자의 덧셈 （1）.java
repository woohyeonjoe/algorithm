class Solution {
    public int solution(String my_string) {
        String str = my_string.toUpperCase().replaceAll("[A-Z]", "");
        
        String[] s = str.split("");
        
        int sum=0;
        for(int i=0; i<s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        
        return sum;
    }
}