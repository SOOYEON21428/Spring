// SungJukOutput.java
package sample04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class SungJukOutput implements SungJuk {

    private List<SungJukDTO2> sungJukList;

    @Autowired
    public SungJukOutput(List<SungJukDTO2> sungJukList) {
        this.sungJukList = sungJukList;
    }

    public SungJukOutput() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void execute() {
        System.out.println("2번인 경우 - SungJukOutput.java");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "이름", "국어", "영어", "수학", "총점", "평균");
        for (SungJukDTO2 sungJukDTO : sungJukList) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10s %-10s\n", sungJukDTO.getName(), sungJukDTO.getKor(),
                    sungJukDTO.getEng(), sungJukDTO.getMath(), "xxx", "xx.xx"); // Calculate total and average
        }
    }
}
