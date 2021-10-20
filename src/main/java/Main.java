import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 5; //정수형 변수 선언
        System.out.println(num);

        String sparta = "Hello Sparta!"; // 문자형 변수 선언, 참조 자료형
        System.out.println(sparta);

        sparta = "Goodbye Sparta"; // 이미 선언된 변수에 다른 값을 할당
        System.out.println(sparta);

        final int num2 = 10; // 상수형 변수 선언 (final로 선언 가능, 재선언 불가능!)
        System.out.println(num2);

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        intEmptyArray[1] = 1;
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5];
        stringEmptyArray[3] = "wow";
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length - 1]);
    }
}
