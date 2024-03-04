package sample05;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component("sungJuk") // Bean의 이름을 "sungJuk"으로 명시
public class SungJukImpl implements SungJuk {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    public SungJukImpl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력: ");
        this.name = scanner.next();
        System.out.print("국어 입력: ");
        this.kor = scanner.nextInt();
        System.out.print("영어 입력: ");
        this.eng = scanner.nextInt();
        System.out.print("수학 입력: ");
        this.math = scanner.nextInt();
    }

    public void calc() {
        this.tot = this.kor + this.eng + this.math;
        this.avg = this.tot / 3.0;
    }

    public void display() {
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.kor);
        System.out.println("영어: " + this.eng);
        System.out.println("수학: " + this.math);
        System.out.println("총점: " + this.tot);
        System.out.println("평균: " + this.avg);
    }
}
