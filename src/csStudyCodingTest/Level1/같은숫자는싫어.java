package csStudyCodingTest.Level1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        List<Integer> list = new ArrayList<>();


        list.contains(list);

        System.out.println(a+b);
        if(a == 2){
            System.out.println(a);
        } else System.out.println(b);


        if (a == 3){
            System.out.println(a + b);
        }
    }
}
