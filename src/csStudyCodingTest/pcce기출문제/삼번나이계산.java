package csStudyCodingTest.pcce기출문제;

import java.util.*;

public class 삼번나이계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }
        System.out.println(answer);
    }
}
