class Solution {
    public int[] solution(long n) {
        long num = n;
        int count = 0;
        
        while(num != 0){
            num /= 10;
            count++;
        }
        
        int[] arr = new int[count];
        for(int i =0; n!=0; i++){
            arr[i] = (int)(n%10);
            n/=10;
        }
        
        return arr;
    }
}
