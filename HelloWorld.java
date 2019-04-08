
public class HelloWorld {
	private String message;
	
	public HelloWorld() {
		message = "Hello World";
	}
	
	public String getMessage() {
		return message;
	}
	
	public static void main(String[] args) {
		HelloWorld a = new HelloWorld();
		System.out.println(a.getMessage());
	}

}
