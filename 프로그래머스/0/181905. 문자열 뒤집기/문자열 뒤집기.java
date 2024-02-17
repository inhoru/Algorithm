class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int a = e;
         String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
            if (i >= s && i <= e) {
                answer += arr[a];
                a--;
            } else {
                answer += arr[i];
            }
        }
        return answer;
    }
}