// SungJukDelete.java
package sample04;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Scanner;

@Component
public class SungJukDelete implements SungJuk {

    private List<SungJukDTO2> sungJukList;

    public void setSungJukList(List<SungJukDTO2> sungJukList) {
        this.sungJukList = sungJukList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4번인 경우 - SungJukDelete.java");
        System.out.print("삭제할 이름 입력 : ");
        String name = scanner.nextLine();
        boolean found = false;
        for (SungJukDTO2 sungJukDTO : sungJukList) {
            if (sungJukDTO.getName().equals(name)) {
                sungJukList.remove(sungJukDTO);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("찾고자하는 이름이 없습니다.");
        } else {
            System.out.println("xxx님의 데이터를 삭제 하였습니다");
        }
    }
}
