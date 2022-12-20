class Solution {
    public long solution(long price, long money, long count) {
        for(int i = 1; i <= count; i++) {
            money -= i * price;            
        }
        
        return money < 0 ? money*(-1) : 0;

    }
}
