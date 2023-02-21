class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        
        String[] sp = str.split("");
        
        int result = 0;
        for(String s : sp) {
            result += Integer.parseInt(s);
        }
        
        return result;
        
    }
}