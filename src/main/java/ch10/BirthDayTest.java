package ch10;

public class BirthDayTest {

    public static void main(String[] args) {

        BirthDay date = new BirthDay();

        date.setYear(2021);
        date.setMonth(12);
        date.setDay(30);

//		date.month = 1000; private를 쓰면 이런식으로 잘못 쓰이는 것을 막을 수 있음

        date.showDate();
    }

}