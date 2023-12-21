import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String code) {
        String answer = "";
        char[] array = code.toCharArray();
        int mode = 0;
        
        for(int i = 0;i<array.length;i++){
            if(array[i]=='1'){
                mode = 1 - mode;
            }else{
                if(mode == 0 && i % 2 == 0){
                    answer += array[i];
                }else if (mode == 1 && i % 2 != 0){
                    answer += array[i];
                }
            }
        }
        if(answer.length()==0){
            answer = "EMPTY";
        }
        return answer;
    }
}