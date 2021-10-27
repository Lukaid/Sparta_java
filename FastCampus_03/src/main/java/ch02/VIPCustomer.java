package ch02;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public VIPCustomer() {
        super(); // 이거 안넣어도 컴파일러가 알아서 넣어줌...
        // 디폴트 생성자를 호출해줌.
        // super 클래스는 하위클래스가 상위클래스 인스턴스의 참조값을 가지게 됨

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }
}