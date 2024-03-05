package sample03;

public class MessageBeanKo implements MessageBean{
	private int num;
	
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 기본 생성자");
	}
	
	@override
	public void sayHello(String name) {
		num++;
		System.out.println("num = " + num);
		System.out.println("안녕하세요" + name );
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayHello(String fruit, int cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		// TODO Auto-generated method stub
		
	}

}
