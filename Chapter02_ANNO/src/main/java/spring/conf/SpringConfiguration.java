package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample04.*;
@Configuration
public class SpringConfiguration {
    
    @Bean
    public MessageBeanImpl messageBeanImpl(){
        return new MessageBeanImpl();
    }
    
    //sample02
    @Bean
    public CalcAdd calcAdd(){
    	return new CalcAdd(25, 36);
    }
    @Bean
    public CalcMul getcalcMul(){
    	return new CalcMul();
    }
    
  

}


//Bean 
// 메소드에서 return 되는 값을 스프링의 빈으로 생성한다. 메소드는 설정할 떄는 반드시 빈의 id명으로 해야한다. 메소드명을 설정할 때 자바처럼 getter를 사용하려면 @BEAN(name)을사용한다.//