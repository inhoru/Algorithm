class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
         int[] len = new int[30];
        for(int i = 0; i < strArr.length; i++){
            len[strArr[i].length()-1]++;
        }

        for(int num : len){
            if(answer < num) answer = num;
        }
        return answer;
    }
}