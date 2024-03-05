package sample03;

//SungJukImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
 private SungJukDTO sungJukDTO;

 @Autowired
 public SungJukImpl(SungJukDTO sungJukDTO) {
     this.sungJukDTO = sungJukDTO;
 }

 
}

