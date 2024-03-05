package sample04;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class SungJukInput implements SungJuk {
 @Override
 public void execute() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("1번인 경우 - SungJukInput.java");
     System.out.print("이름 입력 : ");
     String name = scanner.nextLine();
     System.out.print("국어점수 입력 : ");
     int kor = Integer.parseInt(scanner.nextLine());
     System.out.print("영어점수 입력 : ");
     int eng = Integer.parseInt(scanner.nextLine());
     System.out.print("수학점수 입력 : ");
     int math = Integer.parseInt(scanner.nextLine());
     System.out.println(name + "님의 데이터를 입력 하였습니다.");
     // Input logic here
 }
}
