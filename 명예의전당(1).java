import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> temp = new ArrayList();
        for (int i=0; i<score.length; i++) {            
            temp.add(score[i]);
            temp.sort(Collections.reverseOrder());
            answer[i] = i<k ? temp.get(temp.size()-1) : temp.get(k-1);               }
        return answer;
    }
}
