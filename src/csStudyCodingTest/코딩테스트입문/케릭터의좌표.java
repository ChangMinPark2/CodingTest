package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;

public class 케릭터의좌표 {

    public static int[] solution(String[] keyinput, int[] board) {

        int[] answer = new int[2];

        int width = board[0] / 2;
        int height = board[1] / 2;

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                if(answer[0] > -(width)) answer[0] -= 1;
            }
            else if(keyinput[i].equals("right")) {
                if(answer[0] < width) answer[0] += 1;
            }
            else if(keyinput[i].equals("down")) {
                if(answer[1] > -(height)) answer[1] -= 1;
            }
            else if(keyinput[i].equals("up")) {
                if(answer[1] < height) answer[1] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"right", "right", "right", "right", "right", "left"};
        int[] b = {9, 5};

        System.out.println(Arrays.toString(solution(a, b)));

    }
}
