import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int selectNum = nums.length / 2;        // 선택해야하는 폰켓몬 수

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // 중복된 폰켓몬 종류 해시맵에 넣기
        // hashMap<종, 해당 종의 수>
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 1)+1);
        }

        if (selectNum >= hashMap.size()) return hashMap.size();
        else return selectNum;
    }
}