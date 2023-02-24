class Solution {
    public int solution(int num, int k) {
        int result = -1;
        String str1 = Integer.toString(num);
        String str2 = Integer.toString(k);
        if(str1.contains(str2)){
            result = str1.indexOf(str2)+1;
        }
        
        return result;
    }
}