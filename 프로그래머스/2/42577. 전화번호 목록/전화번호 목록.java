import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
                HashSet<String> hashSet = new HashSet<>();
        for (String phone_number : phone_book) {
            hashSet.add(phone_number);
        }

        for (String phone_number : hashSet) {
            for (int i=1; i<phone_number.length(); i++) {
                if (hashSet.contains(phone_number.substring(0, i))) return false;
            }
        }

        return true;
    }
}