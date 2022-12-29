
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String  solution(String[] survey, int[] choices) {
        Map<String,Integer> scores = new HashMap<>();
        scores.put("R", 0);
        scores.put("T", 0);
        scores.put("C", 0);
        scores.put("F", 0);
        scores.put("J", 0);
        scores.put("M", 0);
        scores.put("A", 0);
        scores.put("N", 0);

       for(int i = 0; i < survey.length; i++){
           String temp = choices[i] >= 4 ? survey[i].substring(1,2) : survey[i].substring(0,1);
           int score = Math.abs(choices[i] -4);
           scores.put(temp, scores.get(temp) + score);
               
       }
       
       String type1 = scores.get("R") >= scores.get("T") ? "R" : "T";
       String type2 = scores.get("C") >= scores.get("F") ? "C" : "F";
       String type3 = scores.get("J") >= scores.get("M") ? "J" : "M";
       String type4 = scores.get("A") >= scores.get("N") ? "A" : "N";
        
       return type1 + type2 + type3 + type4;
    }
}
