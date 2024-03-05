package sample03;

//HelloSpring.java
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpring {
 public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

     // 나머지 코드는 이전과 동일합니다.
     SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl");
     sungJuk.calcTot();
     sungJuk.calcAvg();
     sungJuk.display();
 }
}

