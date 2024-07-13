import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        int num = 0;
        for(String rd : record){
            if(rd.contains("Enter")|| rd.contains("Leave")){
                num++;
            }
        }
        
         // 결과를 담을 배열
        String[] result = new String[record.length];
        Map<String, String> resultMap= new HashMap<>();

        for(int  i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(record[i].contains("Enter")){
                resultMap.put(str[1], str[2]);
                result[i] = resultMap.get(str[1]) + ",님이 들어왔습니다.,"+str[1];
            }else if(record[i].contains("Leave")){
                result[i] = resultMap.get(str[1]) + ",님이 나갔습니다.,"+str[1];
            }else if(record[i].contains("Change")){
                result[i]= "";
                resultMap.put(str[1], str[2]);
            }
        }
        
        StringBuilder builder = new StringBuilder();
        for(int i =0; i < result.length; i++){
            if(result[i].isEmpty()){
                continue;
            }

            String[] str2 = result[i].split(",");
            builder.append(resultMap.get(str2[2]) + str2[1] + ",");

        }
        
        return builder.toString().split(",");
        
        
        
    }
}