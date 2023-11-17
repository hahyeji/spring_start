package spring.core.singleton;

public class SingletonService {

    // 본인을 내부에 private static 으로 인스턴스생성
   private static final SingletonService instance = new SingletonService();

   public static SingletonService getInstance() {
       return instance;
   }

   private SingletonService() {} // 외부에서 객체생성 막음

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
