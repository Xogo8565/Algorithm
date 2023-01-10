class Solution {
    public String solution(String s) {
        String[] temp = s.split("");
        int cnt = 0;
        String answer = "";
        
        for(String str : temp){
            cnt = str.contains(" ")? 0 : cnt+1;
            answer += cnt%2 != 0 ? str.toUpperCase() : str.toLowerCase(); 
        } return answer;
    }
}
