package csStudyCodingTest;

import java.util.Random;

public class 로또번호추첨기 {

    public static void main(String[] args) {

        int[] lotto = new int[7];

        for(int i = 0; i < lotto.length; i++){
            int num = (int)(Math.random() * 45) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++){
                if (lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }

            System.out.print("[" + lotto[i] + "] ");
        }
    }
}
