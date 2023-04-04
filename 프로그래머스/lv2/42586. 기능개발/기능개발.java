import java.util.*;

class Solution {
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Stack<Integer> progressesStack = new Stack<>();
        Stack<Integer> speedsStack = new Stack<>();

        for (int i=progresses.length; i>0; i--) {
            progressesStack.push(progresses[i-1]);
            speedsStack.push(speeds[i-1]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while(!progressesStack.isEmpty()) {
            int count = 0;

            while(!progressesStack.isEmpty()){
                if (progressesStack.peek()>=100) {
                    progressesStack.pop();
                    count++;
                } else break;
            }

            if (count > 0) result.add(count);

            for (int i=0; i<progressesStack.size(); i++) {
                progressesStack.set(i, progressesStack.get(i)+speedsStack.get(i));
            }
        }

        return result;

    }
}