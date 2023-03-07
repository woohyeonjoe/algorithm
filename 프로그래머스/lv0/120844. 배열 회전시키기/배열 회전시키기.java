import java.util.*;
import java.io.*;

class Solution {
    public LinkedList<Integer> solution(int[] numbers, String direction) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(int i : numbers) {
            linkedList.add(i);
        }
        
        if(direction.equals("right")) {
            linkedList.addFirst(linkedList.getLast());
            linkedList.removeLast();
        } else {
            linkedList.addLast(linkedList.getFirst());
            linkedList.removeFirst();
        }
        
        return linkedList;
    }
}