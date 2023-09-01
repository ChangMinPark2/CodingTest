package csStudyCodingTest.구름Level_첼린지;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 첫 번째 줄 -> 기능의 개수 N
 * 둘째 줄에 두 정수 T,M -> 현재 시각이 T시 M분이다.
 * 세 번째 줄 N개의 줄에는 정수 Ci가 주어진다. i번째 기능을 개발하는 데는 Ci분의 시간이 걸린다
 */
public class 프로젝트매니징 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        int[] result = new int[2];

        String[] time = input2.split(" ");

        int repo = Integer.parseInt(time[1]);

        for (int i = 0; i < Integer.parseInt(input); i++){
            String input3 = br.readLine();
            repo += Integer.parseInt(input3);
        }
        //105
        result[0] = ((repo / 60) + Integer.parseInt(time[0])) % 24;
        result[1] = (repo % 60);

        System.out.println(result[0] + " " + result[1]);

    }
}
