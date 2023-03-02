import java.util.*;
import java.io.*;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : numlist) {
            if(i%n==0) arr.add(i);
        }
        return arr;
    }
}