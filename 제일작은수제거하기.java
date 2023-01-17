import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr)
            .filter(e -> e != min)
            .toArray();
        
        return answer.length != 0 ? answer : new int[] {-1};
    }
}
