class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        
        if(a==b) return a;
        for(int i = Math.min(a,b); i<=Math.max(a,b); i++) sum += i;
        
        return sum;
    }
}
