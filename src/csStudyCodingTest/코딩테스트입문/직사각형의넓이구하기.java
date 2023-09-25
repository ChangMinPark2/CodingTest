package csStudyCodingTest.코딩테스트입문;

/**
 각 변의 길이는 가장 큰 좌표에서 가장 작은 좌표를 빼주면 된다.
 **/

public class 직사각형의넓이구하기 {

    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < dots.length; i++){
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        return w * h;
    }
}
