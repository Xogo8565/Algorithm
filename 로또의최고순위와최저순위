class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int winCnt = 0;
        for(int i =0; i< lottos.length; i ++){
            if(lottos[i]==0) zeroCnt++;
            
            for(int j = 0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]) winCnt++;
            }
        }
        
        int max = 7 - (winCnt + zeroCnt);
        int min = 7 - (winCnt);
        
        return new int [] { max < 6 ? max : 6, min < 6 ? min : 6};
    }
}
