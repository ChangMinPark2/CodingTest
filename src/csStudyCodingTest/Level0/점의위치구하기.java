package csStudyCodingTest.Level0;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;

        if (dot[0]>0){
            if (dot[1]>0){
                answer = 1;
            } else {
                answer = 4;
            }
        }

        if (dot[0]<0){
            if (dot[1]<0){
                answer = 3;
            } else {
                answer = 2;
            }
        }

        return answer;
    }
}
