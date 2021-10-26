package ch16;

public class Employee {
    // static 변수는 프로그램이 프로세스가 되어 메모리에 잡히는 순간 같이 메모리에 할당되는 변수
    // 멤버변수 등은 인스턴스가 만들어 질때 메모리에 올라감
    // 프로그램이 다 끝나서 메모리에서 언로드되면 없어짐

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
//		employeeName = '스태틱 메서드에선 멤버변수 (인스턴스 변수) 사용 불가~'
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}