class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] result = new int[length];
        for(int i=0; i<length; i++) {
            result[i] = numbers[i]*2;
        }
        
        return result;
    }
}