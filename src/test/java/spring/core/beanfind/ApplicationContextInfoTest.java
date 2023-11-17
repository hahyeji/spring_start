package spring.core.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.AppConfig;

class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] allBeanNames = ac.getBeanDefinitionNames();
        for(String beanDefName : allBeanNames){
            Object bean = ac.getBean(beanDefName);
            System.out.println("beanName ==> " + beanDefName + ", bean ==> " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] allBeanNames = ac.getBeanDefinitionNames();
        for(String beanDefName : allBeanNames){
            // bean metaData
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefName);
            // ROLE_APPLICATION : 사용자가 등록한 bean
            // ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 bean
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefName);
                System.out.println("beanName ==> " + beanDefName + ", bean ==> " + bean);
            }
        }
    }




}
