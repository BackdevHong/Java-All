package ExceptionHandling;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("프로그램이 비정상 종료되지 않았습니다.");
    }
}
