class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        
        int total = 0;
        
        for(int i=0; i<length; i++) {
            total += numbers[i];
        }
        
        return (double)total / length;
    }
}