import java.util.*;
import java.io.*;

/*
 1. n/2 개를 선택가능
 2. n/2 개 선택 중 종을 가장 다양하게 선택
 3. 선택해야하는 수(n/2)가 종의 수보다 크면 종의 수만큼 선택 -> 선택해야하는 수가 종의 수보다 크면 무조건 종의 수를 반환하는게 가장 다양한 종을 선택한 것이다.
 4. 선택해야하는 수(n/2)가 종의 수보다 작다면 n/2를 출력 -> 선택해야하는 수가 종의 수보다 작으면
 */
class Solution {
    public int solution(int[] nums) {
        int selectNum = nums.length / 2;        // 선택해야하는 폰켓몬 수
        
        HashSet<Integer> hashSet = new HashSet<>();
        
        // 중복된 폰켓몬 종류 제거
        for (int num : nums) {
            hashSet.add(num);    
        }
        
        if (selectNum > hashSet.size()) return hashSet.size();
        else return selectNum;
    }
}