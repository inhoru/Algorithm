import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int firstArr = 0;
        int lastArr = 0;
          for(int i = 0; i<arr.length;i++){
            if(arr[i]==2){
                firstArr += i;
                break;
            }
        }
        for(int i = arr.length - 1; i>0;i--){
            if(arr[i]==2){
                lastArr += i;
                break;
            }
        }
         if(firstArr==0&&lastArr==0){
            int[] answer = {-1};
             return answer;
        }else {
            int[] answer = Arrays.copyOfRange(arr,firstArr,lastArr+1);
             return answer;
        }
    }
}