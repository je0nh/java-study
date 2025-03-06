package oop.reference.enumexample;

public enum EnumExample {
   
    GOOGLE("GOOGLE"),
    APPLE("APPLE"),
    GIT_HUB("GIT_HUB"),
    KAKAO("KAKAO"),
    NAVER("NAVER");
    
    private final String provider;
    
    EnumExample(String provider) {
        this.provider = provider;
    }
    
    public String getProvider() {
        return provider;
    }
}
