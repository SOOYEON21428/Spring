package sample03;

//SungJukImpl.java
public class SungJukImpl implements SungJuk {
 private SungJukDTO sungJukDTO;

 public SungJukImpl(SungJukDTO sungJukDTO) {
     this.sungJukDTO = sungJukDTO;
 }

 @Override
 public void calcTot() {
     int tot = sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath();
     sungJukDTO.setTot(tot);
 }

 @Override
 public void calcAvg() {
     double avg = sungJukDTO.getTot() / 3.0;
     sungJukDTO.setAvg(avg);
 }

 @Override
 public void display() {
     System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
             sungJukDTO.getName(), sungJukDTO.getKor(), sungJukDTO.getEng(),
             sungJukDTO.getMath(), sungJukDTO.getTot(), sungJukDTO.getAvg());
 }

 @Override
 public void modify() {
     // 수정 로직을 구현한다면 여기에 작성
 }
}
