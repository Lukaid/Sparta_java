package ch03;

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
        // 상위클래스의 생성자가 default가 아니라면 명시적으로 호출해줘야 됨.
        super(0, "no-name");

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer Call");

    }
    
    // Or

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }


}