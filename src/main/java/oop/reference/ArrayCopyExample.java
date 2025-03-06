package oop.reference;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];
        
        // System.arraycopy(원본배열, 원본배열의 복사 시작 위치, 새 배열, 새 배열의 복사 시작 위치, 복사할 개수)
        System.arraycopy(oldIntArray, 0, newIntArray, 1, oldIntArray.length);
        
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
