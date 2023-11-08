package spring.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.core.AppConfig;

public class MemberServiceTest {

    MemberService service;

    @BeforeEach     //test 실행전에 먼저 실행됨
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        service = appConfig.memberService();
    }


    @Test
    void join() {
        //given
        Long id = 1L;
        Member member = new Member(id, "A", Grade.VIP);

        //when
        service.join(member);
        Member findMem = service.findMember(id);

        //then
        Assertions.assertThat(member).isEqualTo(findMem);

    }
}
