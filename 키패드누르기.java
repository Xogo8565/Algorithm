class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand =10;
        int rightHand =12;

        for(int i : numbers){
            if(i ==1|| i ==4|| i ==7){
                answer+="L";
                leftHand = i;
            }else if(i ==3|| i ==6|| i ==9){
                answer+="R";
                rightHand = i;
            }else {
                if(i ==0) i =11;
                int leftDistance = getDistance(i, leftHand);
                int rightDistance = getDistance(i, rightHand);

                if(leftDistance < rightDistance){
                    answer+="L";
                    leftHand = i;
                }else if(leftDistance > rightDistance){
                    answer+="R";
                    rightHand = i;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        leftHand = i;
                    }else{
                        answer+="R";
                        rightHand = i;
                    }
                }
            }
        }
        return answer;
    }

    public int getDistance(int num, int handLocation){
        return  Math.abs(num - handLocation)/3+Math.abs(num - handLocation)%3;
    }
}
