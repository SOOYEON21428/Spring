package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		//MessageBeanKo messageBeanKo = new MessageBeanKo();
		
		//MessageBeanEn messageBeanEn = new MessageBeanEn();
		
		MessageBean messageBean = new MessageBeanKo();
		messageBean.sayHello("Spring");
	}
}

