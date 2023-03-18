class Solution {
    boolean solution(String s) {
                String str = s.toUpperCase();
        String[] split = str.split("");

        int pCount = 0;
        int yCount = 0;

        for (String s1 : split) {
            if (s1.equals("P")) pCount++;
            if (s1.equals("Y")) yCount++;
        }

        return pCount == yCount;
    }
}