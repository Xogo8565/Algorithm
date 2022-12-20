import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] temp = s.split("");
        int[] answer = new int[s.length()];
        Set<String> used = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            int cnt = 0;
            if(!used.contains(temp[i])){
                used.add(temp[i]);
                answer[i] = -1;
                continue;
            }

            for(int j = i - 1; j>=0; j--){
                cnt++;
                if(temp[i].equals(temp[j])){
                    answer[i] = cnt;
                    break;
                }
            }
        }
        return answer;
    }
}
