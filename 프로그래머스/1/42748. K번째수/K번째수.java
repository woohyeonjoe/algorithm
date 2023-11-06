import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
                int[] result = new int[commands.length];

        int count = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int k = command[2];

            int[] splitArray = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(splitArray);
            result[count++] = splitArray[k-1];
        }

        return result;
    }
}