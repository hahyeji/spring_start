package spring.core;

import spring.core.member.*;
import spring.core.order.Order;
import spring.core.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long id = 1L;
        Member member = new Member(id, "A", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(id, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("finalPrice = " + order.calcuatePrice());

    }

}
