// SungJukUpdate.java
package sample04;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Scanner;

@Component
public class SungJukUpdate implements SungJuk {

    private List<SungJukDTO2> sungJukList;

    public void setSungJukList(List<SungJukDTO2> sungJukList) {
        this.sungJukList = sungJukList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수정할 이름 입력 : ");
        String name = scanner.nextLine();
        SungJukDTO2 foundSungJuk = null;
        for (SungJukDTO2 sungJukDTO : sungJukList) {
            if (sungJukDTO.getName().equals(name)) {
                foundSungJuk = sungJukDTO;
                break;
            }
        }
        if (foundSungJuk == null) {
            System.out.println("찾고자하는 이름이 없습니다.");
        } else {
            System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
            System.out.printf("%s\t%d\t%d\t%d\t%s\t%s\n", foundSungJuk.getName(), foundSungJuk.getKor(),
                    foundSungJuk.getEng(), foundSungJuk.getMath(), "xxx", "xx.xx"); // Calculate total and average
            System.out.print("국어점수 입력 : ");
            int kor = Integer.parseInt(scanner.nextLine());
            System.out.print("영어점수 입력 : ");
            int eng = Integer.parseInt(scanner.nextLine());
            System.out.print("수학점수 입력 : ");
            int math = Integer.parseInt(scanner.nextLine());

            // Update sungJukDTO with new scores
            foundSungJuk.setKor(kor);
            foundSungJuk.setEng(eng);
            foundSungJuk.setMath(math);

            System.out.println("xxx님의 데이터를 수정 하였습니다");
        }
    }
}
