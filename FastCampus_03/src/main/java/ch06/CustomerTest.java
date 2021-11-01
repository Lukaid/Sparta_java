package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신");

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

//        for (Customer customer : customerList) {
//            System.out.println(customer.showCustomerInfo());
//        }
//
//        int price = 10000;
//        for (Customer customer : customerList) {
//
//            int cost = customer.calcPrice(price);
//            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하였습니다.");
//            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
//        }
        if (customerHong instanceof GoldCustomer) {
            GoldCustomer vc = (GoldCustomer) customerHong;
            System.out.println(customerHong.showCustomerInfo());
        }
    }
}
