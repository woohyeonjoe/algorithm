class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] result = new int[num2-num1+1];
        int count = 0;
        for(int i=num1; i<=num2; i++) {
            result[count] = numbers[i];
            count++;
        }
        return result;
    }
}