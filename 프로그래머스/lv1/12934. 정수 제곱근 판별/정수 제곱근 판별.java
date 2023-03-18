class Solution {
    public long solution(long n) {
        long i = 0;
        while(true) {
            if(i * i > n) return -1;
            if(i * i == n) return (i+1)*(i+1);
            i++;
        }
    }
}