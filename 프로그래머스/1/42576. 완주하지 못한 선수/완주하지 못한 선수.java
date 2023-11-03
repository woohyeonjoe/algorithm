import java.util.*;
import java.io.*;

class Solution {
            public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();
        HashMap<String, Integer> completionMap = new HashMap<>();

        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0)+1);     // participantMap<이름, 숫자>
        }

        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
            if (participantMap.get(c) == 0) participantMap.remove(c);
        }

        StringBuffer sb = new StringBuffer();
        for (String s : participantMap.keySet()) {
            sb.append(s);
        }

        return sb.toString();

    }

}