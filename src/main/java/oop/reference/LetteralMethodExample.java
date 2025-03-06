package oop.reference;

public class LetteralMethodExample {
    public static void main(String[] args) {
        replace();
        substring();
        index();
    }
    
    public static void replace() {
        String str = "Hello, Java!";
        // replace 메소드는 문자열을 변경하는 것이 아니라 새로운 문자열을 생성하여 리턴
        String result = str.replace("Java", "World");
        System.out.println("str: " + str);
        System.out.println("result: " + result);
    }
    
    public static void substring() {
        String str = "0123456789";
        
        // substring(int beginIndes)
        String ex1 = str.substring(3);
        System.out.println("ex1: " + ex1);
        
        // substring(int beginIndex, int endIndex)
        String ex2 = str.substring(3, 5);
        System.out.println("ex2: " + ex2);
    }
    
    public static void index() {
        String str = "Hello, Java!";
        
        // indexOf
        // 찾는 문자열이 존재할 때, 처음으로 나오는 위치의 인덱스를 리턴
        int index1 = str.indexOf("Java");
        System.out.println("index1: " + index1);
        
        // 찾는 문자열이 존재하지 않을 때, -1을 리턴
        int index2 = str.indexOf("program");
        System.out.println("index2: " + index2);
        
        // lastIndexOf
        // 찾는 문자열이 존재할 때, 마지막으로 나오는 위치의 인덱스를 리턴
        int index3 = str.lastIndexOf("Java");
        System.out.println("index2: " + index3);
        
        // contains
        // 찾는 문자열이 존재하면 true, 존재하지 않으면 false를 리턴
        boolean result = str.contains("Java");
        System.out.println("result: " + result);
        
        boolean result2 = str.contains("program");
        System.out.println("result2: " + result2);
        
        // startsWith
        // 찾는 문자열로 시작하면 true, 그렇지 않으면 false를 리턴
        boolean result3 = str.startsWith("Hello");
        System.out.println("result3: " + result3);
        boolean result4 = str.startsWith("Java!");
        System.out.println("result4: " + result4);
        
        // endsWith
        // 찾는 문자열로 끝나면 true, 그렇지 않으면 false를 리턴
        boolean result5 = str.endsWith("Hello");
        System.out.println("result5: " + result5);
        boolean result6 = str.endsWith("Java!");
        System.out.println("result6: " + result6);
    }
}
