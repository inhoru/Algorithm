class Solution {
    public int solution(int[] num_list) {
         int sum = 0;
        int multiplication = 1;
        int answer = 0;

        for (int num : num_list) {
            answer = (num_list.length >= 11) ? (sum += num) : (multiplication *= num);
        }
        return answer;
    }
}