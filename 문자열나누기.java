class Solution {
    public int solution(String s) {
       String[] arr  =  s.split("");
       String start = arr[0];
       int tempA = 0;
       int tempB = 0;
       int cnt = 0;

       for(int i =0; i<arr.length-1; i++){
           if(start.equals(arr[i])) tempA++;
           else tempB++; 

           if(tempA==tempB) {
               start = arr[i+1];
               cnt++;
           }
           
       }
       return cnt+1;
    }
}
