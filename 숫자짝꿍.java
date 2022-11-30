import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
      public String solution(String X, String Y) {
        int[] intX = {0,0,0,0,0,0,0,0,0,0};
        int[] intY = {0,0,0,0,0,0,0,0,0,0};
        for(String temp : X.split("")) intX[Integer.parseInt(temp)]++;
        for(String temp : Y.split("")) intY[Integer.parseInt(temp)]++;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<10; i++){
            while(intX[9-i]> 0 && intY[9-i]>0){
                stringBuilder.append(9-i);
                intX[9-i]--;
                intY[9-i]--;
            }
        }

        if(stringBuilder.toString().equals("")) return "-1";

        return stringBuilder.toString().charAt(0) == '0' ? "0" : stringBuilder.toString();
    }

}
