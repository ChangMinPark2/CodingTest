package csStudyCodingTest.구름Level_첼린지;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 입력갑 W , 횟수
 * 리턴값 W + (1 + 횟수 / 30 )
 */
public class 운동중독플레이어 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] str = input.split(" ");

        double a = Double.parseDouble(str[0]) * (1 + Double.parseDouble(str[1])/30);

        System.out.println((int)a);
    }
}
