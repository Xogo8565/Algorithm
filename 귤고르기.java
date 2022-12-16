import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<tangerine.length; i++){
            map.put(tangerine[i] , map.getOrDefault(tangerine[i], 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> temp : list) {
            if(k<=0) break;
            answer++;
            k -= temp.getValue();
        }
        return answer;
    }
}


