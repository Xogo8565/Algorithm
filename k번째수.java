import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list;
        int[] answer = new int[commands.length];
        for(int i =0; i<commands.length; i++){
            list = new ArrayList<>();
            for(int j =commands[i][0]; j<=commands[i][1]; j++){
                list.add(array[j-1]);
            } Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }

        return answer;
    }

}
