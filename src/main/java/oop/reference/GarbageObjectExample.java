package oop.reference;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        // hobby2는 "여행" 주소를 참조
        String hobby2 = hobby;
        // hobby는 새로운 주소를 참조하게 되고 "여행" 주소는 더 이상 참조하지 않음
        hobby = null;
        // hobby2는 여전히 "여행"을 참조하고 있음
        System.out.println("hobby2: " + hobby2);
    }
}
