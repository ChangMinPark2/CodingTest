package csStudyCodingTest.Level0;

import java.util.*;

public class 그림확대하기 {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++){
            for (int j = 0; j < k; j++){
                picture[i] = picture[i].replace(".", "..");
                picture[i] = picture[i].replace("x", "xx");
            }
        }

        return picture;
    }
}
