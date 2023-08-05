package csStudyCodingTest.Level0;

import java.util.Scanner;

public class 대소문자바꿔출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<a.length(); i++){
            if (Character.isLowerCase(a.charAt(i))){
                sb.append(Character.toUpperCase(a.charAt(i)));
            } else sb.append(Character.toLowerCase(a.charAt(i)));
        }
        System.out.println(sb);
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
