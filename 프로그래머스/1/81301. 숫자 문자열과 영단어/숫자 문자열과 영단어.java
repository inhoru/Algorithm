class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
         for(int i = 0; i<arr.length;i++){
            if(s.contains(arr[i])){
               s = s.contains(arr[i])?s.replace(arr[i],""+i):s;
            }
        }
        return Integer.parseInt(s);
    }
}