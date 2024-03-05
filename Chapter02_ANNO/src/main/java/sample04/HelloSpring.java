// HelloSpring.java
package sample04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import spring.conf.SpringConfiguration;

import java.util.Scanner;

@Component
public class HelloSpring {

    @Autowired
    private SungJukInput sungJukInput;

    @Autowired
    private SungJukOutput sungJukOutput;

    @Autowired
    private SungJukUpdate sungJukUpdate;

    @Autowired
    private SungJukDelete sungJukDelete;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HelloSpring helloSpring = context.getBean("helloSpring", HelloSpring.class);
        helloSpring.menu();
        context.close();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        SungJuk sungJuk = null;
        String choice;
        do {
            System.out.println("menu()");
            System.out.println("**************");
            System.out.println("   1. 입력");
            System.out.println("   2. 출력");
            System.out.println("   3. 수정");
            System.out.println("   4. 삭제");
            System.out.println("   5. 끝");
            System.out.println("**************");
            System.out.print("번호 : ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    sungJuk = sungJukInput;
                    break;
                case "2":
                    sungJuk = sungJukOutput;
                    break;
                case "3":
                    sungJuk = sungJukUpdate;
                    break;
                case "4":
                    sungJuk = sungJukDelete;
                    break;
                case "5":
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue;
            }
            if (!choice.equals("5")) {
                sungJuk.execute();
            }
        } while (!choice.equals("5"));
    }
}
