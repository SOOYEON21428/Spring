// HelloSpring.java
package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 데이터 입력
        SungJukDTO sungJukDTO = new SungJukDTO();
        sungJukDTO.setName("홍길동");
        sungJukDTO.setKor(97);
        sungJukDTO.setEng(100);
        sungJukDTO.setMath(95);

        // 빈 생성 및 총점, 평균 계산
        SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl", sungJukDTO);
        sungJuk.calcTot();
        sungJuk.calcAvg();

        // 결과 출력
        sungJuk.display();
    }
}
