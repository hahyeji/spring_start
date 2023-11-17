### test code
- test 패키지 하위
- junit 사용
- 단축키 : ctrl shift t


### spring container
- ApplicationContext : 스프링 컨테이너
- 기존 : AppConfig사용해서 직접 객체생성 => 변경 : spring container를 사용해서 객체생성
- @Configuration annotation이 붙은 AppConfig class를 설정정보로 사용.
- @Bean 붙은 methods 모두 호출하여 반환된 객체를 spring container에 등록
- spring container에 등록된 객체 : spring bean
- spring bean의 name : @Bean(name = "이름") 없으면 @Bean 붙은 메소드명
- spring bean 가져오는 법 : ApplicationContext 객체생성 후 applicationContext.getBean() method 사용

