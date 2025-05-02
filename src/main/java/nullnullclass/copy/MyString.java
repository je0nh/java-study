package nullnullclass.copy;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public MyString(MyString str) {
        this.deepCopy(str.getString());
    }

    public String getString() {
        return str;
    }

    public void setString(String str) {
        this.str = str;
    }

    private void deepCopy(String str) {
        this.str = new String(str);
    }
}

class Main {

    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("World");
        System.out.println(dst.getString());
    }
}
