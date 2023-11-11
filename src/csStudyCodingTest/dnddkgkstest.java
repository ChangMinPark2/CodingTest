package csStudyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class dnddkgkstest {

    private static String abcddd = "abc";

    public static void main(String[] args) {
        String a = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1";

        HashMap<String, Integer> menuMap = new HashMap<>();
        String[] menuAndCounts = a.split(",");

        for (String menuAndCount : menuAndCounts) {
            String[] menuAndCountArr = menuAndCount.split("-");
            String menu = (menuAndCountArr[0]);
            Integer count = Integer.parseInt(menuAndCountArr[1]);

            menuMap.put(menu, count);
        }


        System.out.println(menuMap);

    }

    public static String abc(){
        System.out.println("안녕");
        return abcddd;
    }
}
