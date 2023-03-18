class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] s = str.split("");
        
        int sum = 0;
        for(int i=0; i<s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        
        if(x % sum == 0) return true;
        else return false;
    }
}