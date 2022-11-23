class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char c;
        int rs = 0;
        
        for(int i =0; i<s.length(); i++){
            c = s.charAt(i);
            if(c=='p') rs++;
            else if(c=='y') rs--;
        }
        if(rs==0) return true;
        return false;
    }
}
