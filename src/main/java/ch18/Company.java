package ch18;

public class Company {

    // 싱글톤패턴, 인스턴스를 단 한개만 만들어야 할 때 사용함
    
    // 유일한 인스턴스를 여기서 생성, 당연히 static으로 생성
    private static Company instance = new Company();

    private Company() {

    }

    public static Company getInstance() {
        // 혹시라도 인스턴스가 없으면 생성, 방어적인 코드
        if (instance == null) {
            instance = new Company();
        }
        // 인스턴스 반환
        return instance;
    }

}