package csStudyCodingTest.고득점kit_완전탐색;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        for (int x = 3; x < brown; x++) {
            for (int y = 3; y <= x; y++) {
                int repoB = (x + y - 2) * 2;
                int repoY = (x * y) - brown;

                if (repoB == brown && repoY == yellow) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }
}
