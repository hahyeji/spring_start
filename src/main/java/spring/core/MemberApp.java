package spring.core;

import spring.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService service = appConfig.memberService();
//        MemberService service = new MemberServiceImpl(new MemoryMemberRepository());
        Long id = 1L;
        Member member = new Member(id, "A", Grade.VIP);
        service.join(member);


        Member findMem = service.findMember(id);
        System.out.println("new member ==> " + member.getName());
        System.out.println("find member ==> " + findMem.getName());

    }
}
