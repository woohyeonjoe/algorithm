class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        for(int n=i; n<=j; n++) {
            for(char c : Integer.toString(n).toCharArray()) {
                if(c==(char)(k+48)) count++;
            }
        }
        
        return count;
    }
}