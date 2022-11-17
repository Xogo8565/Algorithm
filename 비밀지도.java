import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String temp;
        String temp2;
        String temp3 = "";

        String[] answer = new String[n];

        for(int i=0; i< n; i ++){
            temp = toBinary(arr1[i], n);
            temp2 = toBinary(arr2[i], n);
            System.out.println(temp);

            for(int j=0; j<n; j++){
                temp3 += temp.charAt(j) == '1' || temp2.charAt(j) == '1' ? "#" : " ";
            }
            answer[i] = temp3;
            temp3 = "";
        }

        return answer;
    }

    public String toBinary(int num, int length){
        String str = Integer.toString(num, 2);
        String temp = "";
        if(str.length()!=length) {
            for(int j=0; j<length-str.length(); j++){
                temp += "0";
            } str = temp + str;
        } return str;
    }

}
