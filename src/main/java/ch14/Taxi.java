package ch14;

public class Taxi {

    String TaxiName;
    int passengerCount;
    int money;

    public Taxi(String TaxiName) {
        this.TaxiName = TaxiName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println(TaxiName + "번의 승객 수는" + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}