class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int index = 0;
        int count = 0;
        for(int i : array) {
            if(max < i) {
                max = i;
                index=count;
            }
            count++;
        }
        int[] arr = new int[2];
        arr[0]=max;
        arr[1]=index;
        
        return arr;
    }
}