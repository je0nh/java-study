package basic;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 엔터키가 입력되기 전까지 블록킹 됨
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
