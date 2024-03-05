// HelloSpring.java
package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class HelloSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = context.getBean("helloSpring", HelloSpring.class);
        helloSpring.menu();
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
                    sungJuk = new SungJukInput();
                    break;
                case "2":
                    sungJuk = new SungJukOutput();
                    break;
                case "3":
                    sungJuk = new SungJukUpdate();
                    break;
                case "4":
                    sungJuk = new SungJukDelete();
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
