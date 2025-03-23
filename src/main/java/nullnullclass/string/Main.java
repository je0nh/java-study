package nullnullclass.string;

class MyString {
    private byte[] string;

    public String getString() {
        if (this.string == null) return "(null)";

        String s = "";

        int n = string.length / 2;
        for (int i = 0; i < n; i++) {
            byte high = this.string[i * 2];
            byte low = this.string[(i * 2) + 1];

            char c = (char) ((high << 8) | (low & 0xFF));
            s += c;
        }
        return s;
    }

    public void setString(String s) {
        int n = s.length();
        this.string = new byte[n * 2];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            byte high = (byte) (c >> 8);
            byte low = (byte) (c & 0xFF);

            string[i * 2] = high;
            string[(i * 2) + 1] = low;
        }
    }

    public int length() {
        if (this.string == null) {
            return 0;
        }
        return string.length / 2;
    }

    public int compareTo(String s) {
        int n = string.length / 2;
        if (s.length() != n) return -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            byte high = (byte) (c >> 8);
            byte low = (byte) (c & 0xFF);

            if (string[i * 2] != high || string[(i * 2) + 1] != low) {
                return -1;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.length());
        System.out.println(str.getString());
        System.out.println(str.compareTo("Hello Java"));
    }
}
