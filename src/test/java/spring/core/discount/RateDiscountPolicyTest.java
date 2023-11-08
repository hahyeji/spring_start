package spring.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring.core.member.Grade;
import spring.core.member.Member;


class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_d() {

        //given
        Member vipMem = new Member(1L,"memberVIP", Grade.VIP);

        //when
        int discount = discountPolicy.discount(vipMem, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);

    }
}