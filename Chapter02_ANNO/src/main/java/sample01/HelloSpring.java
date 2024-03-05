package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Getting beans from the context
        MessageBeanImpl messageBean = (MessageBeanImpl) context.getBean("messageBeanImpl");

        // Assuming line 11 is the following line
        messageBean.sayHello(); // This line may cause a NullPointerException if messageBean is null
    }
}
