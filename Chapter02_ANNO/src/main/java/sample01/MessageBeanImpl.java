package sample01;

import org.springfamework.stereotype.Component; 


public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	private int qty;
	
	
	//Setter Injection
	//public void setCost(int cost) {
	//	this.cost = cost;
	//}

	//public void setQty(int qty) {
	//	this.qty = qty;
	//}
	//private int qty;

	//생성자 Injection
	//public MessageBeanImpl(String fruit) {
	//	this.fruit = fruit;
	//}
	
	@Override
	public void sayHello() {
		
	}
	
	@Override
	public void sayHello(String fruit, int cost) {
		
	}
	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}
	

}