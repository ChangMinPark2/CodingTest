package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;

public class 다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        //x + x + x
        System.out.println(Arrays.toString(arr));
        int strNum = 0;
        int num = 0;

        if (arr[0].contains("x")){
            System.out.println("x만 있어서 포함하지 않는다");
        } else {
            System.out.println("과연");
        }

        for (String s : arr) {
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }

        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        }

        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }

        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }

        return answer;
    }

    public static void main(String[] args) {
        다항식더하기 aa = new 다항식더하기();
        String a = "3x + 7 + x";
        String b = "x + x + x";
        System.out.println(aa.solution(b));
    }
}
