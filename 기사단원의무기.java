import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int sum = 0;

        for(int i =1; i <= number; i++){
            int temp = countDivisor(i);
            sum += temp > limit ? power : temp;
        }
        return sum;
    }

    public int countDivisor(int num){
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        } return count;
    }
}
