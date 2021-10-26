package ch10;

public class BirthDay {

    private int day;
    private int month;
    private int year;

    private boolean isValid; // default = false

    // 두개 만들고 우클릭 Source - Generate Getter and Setter,  정보를 보호하는 방법
    // private 변수의 오용을 막고, 원하는 방향으로 get, set 메서드를 사용하여 구성할 수 있음.
    // client에서 잘못 사용하는 것을 막을 수 있다.
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        } else {
            System.out.println( "유효하지 않은 날짜입니다.");
        }
    }
}