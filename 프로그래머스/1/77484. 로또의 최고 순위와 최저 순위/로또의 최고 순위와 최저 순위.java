class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int minCount = 0;
        int maxCount = 0;
            for (int lotto : lottos) {
            if (lotto == 0) {
                maxCount++;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    minCount++;
                }
            }
        }
        answer[0] = prize(maxCount + minCount);
        answer[1] = prize(minCount);

        return answer;
        
    }

    public static int prize(int num) {
        switch (num) {
            case 0:
                return 6;
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
        }
        return num;
    }
}