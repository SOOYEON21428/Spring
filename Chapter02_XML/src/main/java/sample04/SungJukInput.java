package sample04;

import org.springframework.stereotype.Component;
import lombok.Setter; // Import the Setter annotation from Lombok

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class SungJukInput implements SungJuk {
    private SungJukDTO2 sungJukDTO2;
    @Setter private List<SungJukDTO2> list; // Apply Setter annotation to the list field

    // Constructor to initialize the list
    public SungJukInput() {
        this.list = new ArrayList<>();
    }

    public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
        this.sungJukDTO2 = sungJukDTO2;
    }

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

        // Set values to the SungJukDTO2 object
        sungJukDTO2.setName(name);
        sungJukDTO2.setKor(kor);
        sungJukDTO2.setEng(eng);
        sungJukDTO2.setMath(math);
        sungJukDTO2.setTot(kor + eng + math);
        sungJukDTO2.setAvg((kor + eng + math) / 3.0);
        
        // Add the SungJukDTO2 object to the list
        list.add(sungJukDTO2);
        
        System.out.println(name + "님 입력되었습니다.");
    }
}
