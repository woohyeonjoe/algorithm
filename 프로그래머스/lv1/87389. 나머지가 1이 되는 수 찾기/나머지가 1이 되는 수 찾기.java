class Solution {
    public int solution(int n) {
        int i=0;
        while(true) {
            i++;
            if(n%i==1) return i; 
        }
    }
}