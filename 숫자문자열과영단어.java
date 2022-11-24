import java.util.List;

class Solution {
    public int solution(String s) {
        List<String> numList = List.of("zero","one","two","three","four","five","six","seven","eight","nine");
        for(int i=0;i<10;i++){
            s=s.replace(numList.get(i), Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
