class Solution {
    public int solution(int n) {

        String str  = Integer.toString(n, 3);
        str = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(str,3);
    }
}
