import java.util.Arrays;
class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] first = new int[2];
        int[] second = new int[2];
        int[] third = new int[2];
        int[] fourth = new int[2];
        
        StringBuilder sb = new StringBuilder();
    
        
         for (int i = 0; i < survey.length; i++) {
            if (survey[i].equals("AN") || survey[i].equals("NA")) {
                if (choices[i] > 4) {
                    if (survey[i].charAt(0) == 'A') {
                        fourth[1] += score(choices[i]);
                    } else {
                        fourth[0] += score(choices[i]);
                    }
                } else {
                    if (survey[i].charAt(0) == 'N') {
                        fourth[1] += score(choices[i]);
                    } else {
                        fourth[0] += score(choices[i]);
                    }
                }
            }
            if (survey[i].equals("JM") || survey[i].equals("MJ")) {
                if (choices[i] > 4) {
                    if (survey[i].charAt(0) == 'J') {
                        third[1] += score(choices[i]);
                    } else {
                        third[0] += score(choices[i]);
                    }
                } else {
                    if (survey[i].charAt(0) == 'M') {
                        third[1] += score(choices[i]);
                    } else {
                        third[0] += score(choices[i]);
                    }
                }
            }
            if (survey[i].equals("CF") || survey[i].equals("FC")) {
                if (choices[i] > 4) {
                    if (survey[i].charAt(0) == 'C') {
                        second[1] += score(choices[i]);
                    } else {
                        second[0] += score(choices[i]);
                    }
                } else {
                    if (survey[i].charAt(0) == 'F') {
                        second[1] += score(choices[i]);
                    } else {
                        second[0] += score(choices[i]);
                    }
                }
            }
            if (survey[i].equals("RT") || survey[i].equals("TR")) {
                if (choices[i] > 4) {
                    if (survey[i].charAt(0) == 'R') {
                        first[1] += score(choices[i]);
                    } else {
                        first[0] += score(choices[i]);
                    }
                } else {
                    if (survey[i].charAt(0) == 'T') {
                        first[1] += score(choices[i]);
                    } else {
                        first[0] += score(choices[i]);
                    }
                }
            }
        }
        
        String[] arr = new String[4];
        
        if (first[0] > first[1]) {
            arr[0] = "R";
        } else if (first[0] < first[1]) {
            arr[0] = "T";
        } else  {
            arr[0] = "R";
        }

        if (second[0] > second[1]) {
            arr[1] = "C";
        } else if (second[0] < second[1]) {
            arr[1] = "F";
        } else  {
            arr[1] = "C";
        }

        if (third[0] > third[1]) {
            arr[2] = "J";
        } else if (third[0] < third[1]) {
            arr[2] = "M";
        } else  {
            arr[2] = "J";
        }

        if (fourth[0] > fourth[1]) {
            arr[3] = "A";
        } else if (fourth[0] < fourth[1]) {
            arr[3] = "N";
        } else {
            arr[3] = "A";
        }

         for(String st : arr){
            sb.append(st);
        }
        
        
        return sb.toString();
    }
    

public static int score(int num){
        switch(num){
        case 1:
        return 3;
        case 2:
        return 2;
        case 3:
        return 1;
        case 4:
        return 0;
        case 5:
        return 1;
        case 6:
        return 2;
        case 7:
        return 3;
        }
        return num;
        }
}
