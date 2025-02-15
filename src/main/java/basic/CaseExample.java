package basic;

public class CaseExample {
    public static void main(String[] args) {
        int n = 3;

        // break가 존재할 때
        System.out.println("break가 존재할 때");
        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
        }

        // break가 존재하지 않을 때
        System.out.println();
        System.out.println("break가 존재하지 않을 때");
        switch (n) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
        }
        
        // java 12 이후 -> break 없이 사용 가능
        System.out.println();
        System.out.println("자바 12 이후");
        switch (n) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
        }

        switch (n) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> {
                System.out.print("여러줄을");
                System.out.print(" 사용하고 싶을 때");
                System.out.println(" {} 안에 넣어야 합니다.");
            }
            case 4 -> System.out.println("4");
        }
    }
}
