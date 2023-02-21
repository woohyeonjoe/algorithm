class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        for(int i=0; i<=n; i++) {
            if(i%2!=0) count++;
        }
        
        
        int[] arr = new int[count];
        
        count = 0;
        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                arr[count]=i;
                count++;
            }
        }
        
        return arr;
    }
}