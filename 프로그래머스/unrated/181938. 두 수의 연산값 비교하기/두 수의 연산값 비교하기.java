class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt(""+a+b);
        int num1 = 2*a*b;
   
        int answer = num == num1 ? a : Math.max(num,num1);
        return answer;
    }
}