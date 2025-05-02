package nullnullclass.copy;

public class Main {
    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("World");
        System.out.println("src String: " + src.getString());
        System.out.println("dst String: " + dst.getString());

        StaticExample s1 = StaticExample.newString(10);
        StaticExample s2 = StaticExample.newString("Test");

        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(StaticExample.getCount());
    }
}
