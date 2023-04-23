package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기1 {
    public static int[] solution(int l, int r) {
        int[] answer = {-1};

        List<Integer> list = new ArrayList<>();

        for (int i=l; i<=r; i++){
            String binaryString = String.valueOf(i);
            int binary = Integer.parseInt(String.valueOf(i), 2);
            boolean q = binaryString.equals(Integer.toBinaryString(binary));
            if (q){
                list.add(i);
            }
            q = false;
        }
        if (list.isEmpty()){
            return answer;
        }
        answer = new int[list.size()];

        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;


//        int binary1 = Integer.parseInt(String.valueOf(l/5), 2); //1
//
//        int binary2 = Integer.parseInt(String.valueOf(r/5), 2); //7
//
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = binary1; i<=binary2; i++){
//                list.add(5 * Integer.parseInt(Integer.toBinaryString(i)));
//        }
//
//        answer = new int[list.size()];
//
//
//        for (int i=0; i<list.size(); i++){
//            answer[i] = list.get(i);
//        }

//        return answer;
    }

    public static void main(String[] args) {

//        int l = 10; int r = 20; //2, 4 -> 2진수가 아님
//
//        int answer[] = {-1};
//
//        char[] t = {'0', '5'};
//        char ch;
//        for (int i=l; l<=r; i++){
//            if (String.valueOf(i).charAt(i) != '0' && String.valueOf(i).charAt(i) != '5')
//                return;
//        }
//
//        int test1 = Integer.parseInt(String.valueOf(l/5),2); //1
//        System.out.println(test1);
//        int test2 = Integer.parseInt(String.valueOf(r/5), 2); //7
    //        System.out.println(test2);
    //
//        List<Integer> list = new ArrayList<>();
//        int a = 0;
//        for (int i=test1; i<=test2; i++){
//            list.add(5 * Integer.parseInt(Integer.toBinaryString(i)));
//        }
//
//        answer = new int[list.size()];
//
//        for (int i=0; i<list.size(); i++){
//            answer[i] = list.get(i);
//        }

       System.out.println(Arrays.toString(solution(10, 500)));
    }
}
