package spring.core.discount;

import spring.core.member.Grade;
import spring.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPer = 10;

    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP){
            return price * discountPer / 100;
        }else{
            return 0;
        }

    }
}
