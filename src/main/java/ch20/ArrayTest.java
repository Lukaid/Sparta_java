package ch20;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
            System.out.println(arr[i]);
        }

        for ( int num : arr ){
            total += num;
        }

        System.out.println(total);
    }
}

class ArrayTest2 {
    public static void main(String[] args) {
        double[] dArr = new double[5];
        // 선언은 5칸짜리로 했는데 할당을 다 안해줌...
        // 파이썬의 리스트와 상당히 다르네..
        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        double mtotal = 1;

        for(int i = 0; i< dArr.length; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal); // 0이 나옴, 왜냐면 0이 초기값이니까

    }
}

class ArrayTest3 {
    public static void main(String[] args) {
        double[] dArr = new double[5];

        int count = 0; // 배열에 들어가는 인자의 수를 세주는 변수 선언

        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;

        for(int i = 0; i< count; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal); // 7.161000000000001, 의도대로 계산 됨

    }
}
