package sample01;

public class MessageBean {
	private static MessageBean messageBean;

	public static void main(String[] args) {
		MessageBean.messageBean = new MessageBean();
		messageBean.sayHello("Spring");
	}

	private void sayHello(String string) {
		// TODO Auto-generated method stub
		
	}

}
