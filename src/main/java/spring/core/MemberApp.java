package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService service = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService service = applicationContext.getBean("memberService", MemberService.class);

        Long id = 1L;
        Member member = new Member(id, "A", Grade.VIP);
        service.join(member);


        Member findMem = service.findMember(id);
        System.out.println("new member ==> " + member.getName());
        System.out.println("find member ==> " + findMem.getName());

    }
}
