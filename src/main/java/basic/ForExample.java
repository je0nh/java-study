package basic;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 4) {
                    System.out.printf("i=%d, j=%d\n", i, j);
                    break;
                }
                System.out.printf("i=%d, j=%d\n", i, j);
            }
        }

        System.out.println();
        System.out.println("바깥쪽 반복문도 종료시키기");
        Outter : for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 4) {
                    System.out.printf("i=%d, j=%d\n", i, j);
                    break Outter;
                }
                System.out.printf("i=%d, j=%d\n", i, j);
            }
        }
    }
}
