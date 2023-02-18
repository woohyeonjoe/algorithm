class Solution {
    public int[] solution(int money) {
        int c = money / 5500;
        int m = money-(c*5500);
        
        int[] result = new int[2];
        result[0] = c;
        result[1] = m;
        
        return result;
    }
}