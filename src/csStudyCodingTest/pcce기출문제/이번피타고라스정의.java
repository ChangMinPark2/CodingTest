package csStudyCodingTest.pcce기출문제;

import java.util.*;

public class 이번피타고라스정의 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) Math.pow(c, 2) - (int) Math.pow(a, 2);

        System.out.println(b_square);
    }
}
