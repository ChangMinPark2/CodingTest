package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 구로나눈나머지 {

    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] repo = number.split("");
        for(String a : repo) {
            sum += Integer.parseInt(a);
        }
        answer = sum % 9;

        return answer;
    }

    public static void main(String[] args) {
//        while (true) {
//            System.out.print("숫자를 입력해주세요 : ");
//            Scanner scanner = new Scanner(System.in);
//
//            List<Integer> playerNumbers = new ArrayList<>();
//            String input = scanner.next();
//            if (input.equals("1")){
//                System.out.println("굳");
//            }
//
//            for (String number : input.split("")) {
//                playerNumbers.add(Integer.parseInt(number));
//            }
//
//            int i = 0;
//            i++;
//            if(i > 3){
//                break;
//            }
//        }

        System.out.println("안녕");
    }
}
