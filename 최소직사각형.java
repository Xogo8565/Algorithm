import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        for(int i = 0; i <sizes.length; i++){
            Arrays.sort(sizes[i]);
            x = Math.max(x, sizes[i][0]);
            y = Math.max(y, sizes[i][1]);
            
        } return x * y;
    }
}
