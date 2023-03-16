class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        
        long temp=0;
        for(int i=0; i<n; i++) {
            temp += x;
            arr[i] = temp;
        }
        
        return arr;
    }
}