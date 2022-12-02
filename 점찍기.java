class Solution {
    public long solution(int k, int d) {
       long cnt = 0;

        for(long i =0; i<=d; i+=k){
            int maxY=(int)Math.sqrt(Math.pow(d,2) - Math.pow(i,2));            
            cnt += (long)(maxY / k) + 1;
        } return cnt;
    }
}
