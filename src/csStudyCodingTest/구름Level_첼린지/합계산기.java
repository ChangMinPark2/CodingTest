package csStudyCodingTest.구름Level_첼린지;

import java.io.*;

/***
 * 첫 줄 식의 개수
 */
public class 합계산기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int result = 0;

        for (int i = 0; i < Integer.parseInt(input); i++){
            String input2 = br.readLine();
            String[] a = input2.split(" ");

            if (a[1].equals("+")){
                result += Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
            } else if (a[1].equals("-")) {
                result += Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
            } else if (a[1].equals("/")){
                result += Integer.parseInt(a[0]) / Integer.parseInt(a[2]);
            } else {
                result += Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
            }
        }
        System.out.println(result);
    }
}
