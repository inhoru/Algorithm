class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        int l = arr.length - n;
        for(int i = l; l < arr.length; l++){
            answer += arr[l];
        }
        return answer;
    }
}