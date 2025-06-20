package string.copy;

public class MyString {
    // 문자열을 byte[]로 저장하여 메모리 효율성을 높임
    private byte[] string;

    public MyString() {
        string = null;
    }

    public MyString(String param) {
        // getBytes() 메서드를 사용하여 문자열을 byte[]로 변환 -> "abc" = {97, 98, 99}
        string = param.getBytes();
    }

    // 숫자를 문자로 초기화하기 위한 생성자
    public MyString(int param) {
        String tmp = String.format("%d", param);
        string = tmp.getBytes();
    }

    public MyString(MyString rhs) {
        this.deepCopy(rhs);
    }

    public String getString() {
        return new String(string);
    }

    public void setString(String str) {
        if (str != null) {
            string = str.getBytes();
        } else {
            string = null;
        }
    }

    private void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
    }
}
