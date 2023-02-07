class Solution {
    public int[] solution(String[] strlist) {
        int length = strlist.length;
        int[] result = new int[length];
        for(int i=0; i<length; i++) {
            result[i] = strlist[i].length();
        }
        
        return result;
    }
}