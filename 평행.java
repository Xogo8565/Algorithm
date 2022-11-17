import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[][] dots) {
        Set<Double> set = new HashSet<>();

       for(int i =0; i<dots.length; i++){
          for(int j=i+1; j<dots.length; j++) {
              set.add((double) (dots[i][1] - dots[j][1]) / (double) (dots[i][0] - dots[j][0]));
          }
       }

        return set.size()== 6 ? 0 : 1 ;
    }

}
