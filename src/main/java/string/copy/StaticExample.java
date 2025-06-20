package string.copy;

public class StaticExample {
    private byte[] string;
    private static int count = 0;

    private StaticExample() {
        string = null;
    }

    private StaticExample(String str) {
        this.string = str.getBytes();
        count++;
    }

    private StaticExample(int num) {
        String tmp = String.format("%d", num);
        this.string = tmp.getBytes();
        count++;
    }

    public static StaticExample newString(String str) {
        return new StaticExample(str);
    }

    public static StaticExample newString(int num) {
        return new StaticExample(num);
    }

    public String getString() {
        return new String(string);
    }

    public static int getCount() {
        return count;
    }
}
