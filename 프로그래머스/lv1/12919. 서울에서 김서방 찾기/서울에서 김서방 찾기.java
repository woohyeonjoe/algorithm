class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        for(String str : seoul) {
            if(str.equals("Kim")) return "김서방은 " + count + "에 있다";
            count++;
        }
        return "";
    }
}