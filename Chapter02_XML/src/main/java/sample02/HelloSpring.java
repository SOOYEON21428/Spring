// HelloSpring.java
package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Getting beans from the context
        Calc addCalc = (Calc) context.getBean("add");
        Calc mulCalc = (Calc) context.getBean("mul");

        // Calculating
        addCalc.calculate();
        mulCalc.calculate();
    }
}
