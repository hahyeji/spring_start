package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.member.*;
import spring.core.order.Order;
import spring.core.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long id = 1L;
        Member member = new Member(id, "A", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(id, "itemA", 40000);

        System.out.println("order = " + order);
        System.out.println("finalPrice = " + order.calcuatePrice());

    }

}
