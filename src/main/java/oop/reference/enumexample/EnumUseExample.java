package oop.reference.enumexample;

public class EnumUseExample {
    public static void main(String[] args) {
        EnumExample selectedProvider = EnumExample.GOOGLE;

        String provider = selectedProvider.getProvider();;
        switch (selectedProvider) {
            case NAVER:
            case GOOGLE:
            case KAKAO:
                System.out.println(provider + "를 선택하셨습니다.");
                break;
            default:
                System.out.println(provider + "를 선택하셨습니다.");
                break;
        }
    }
}
