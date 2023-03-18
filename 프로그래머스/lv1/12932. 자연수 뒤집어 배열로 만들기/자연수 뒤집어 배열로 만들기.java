class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] split = str.split("");

        int[] arr = new int[split.length];
        int count = 0;
        for (int i=split.length-1; i>=0; i--) {
            arr[count++] = Integer.parseInt(split[i]);
        }

        return arr;
    }
}