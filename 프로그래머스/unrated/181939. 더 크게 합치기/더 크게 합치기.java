class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int num1 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
                 
        int answer = Math.max(num,num1);
        return answer;
    }
}