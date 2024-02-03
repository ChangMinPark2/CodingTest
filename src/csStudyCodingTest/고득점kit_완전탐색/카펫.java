package csStudyCodingTest.고득점kit_완전탐색;

/**
 * 테두리 갈색 격자와 나머지 노란색 격자의 개수를 통하여 가로와 세로를 구하는 문제.
 * brown의 최솟값 8, yellow의 최솟값 1 -> 가로 세로의 최솟값은 3이다.
 * 이중반복문 3,3 으로 시작하여 brown과 yellow의 개수가 같다면 리턴한다.
 */
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
