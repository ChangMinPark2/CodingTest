package csStudyCodingTest.Level0;

/**
 w -> +1
 s -1
 d +10
 a -10
 **/

public class 수조작하기투 {

    public String solution(int[] numLog) {
        String answer = "";
        int a = numLog[0];

        for(int i = 1; i < numLog.length; i++){

            if(numLog[i] - a == 1){
                answer += "w";
            } else if (numLog[i] - a == -1){
                answer += "s";
            } else if (numLog[i] - a == 10){
                answer += "d";
            } else if (numLog[i] - a == -10){
                answer += "a";
            }

            a = numLog[i];
        }

        return answer;
    }
}
