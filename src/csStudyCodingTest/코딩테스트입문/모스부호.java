package csStudyCodingTest.코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

public class 모스부호 {
    public static String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String a = ".... . .-.. .-.. ---";

        System.out.println(solution(a));
    }
}
