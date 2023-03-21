class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        String[] split = str.split("");
            
        int count = 0;
        for(String s : split) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) count++;
        }
        
        return count;
    }
}