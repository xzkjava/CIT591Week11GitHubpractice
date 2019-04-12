import java.util.Scanner;

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
		//prompt the user to type the name
		System.out.println("Please enter your name:");
		Scanner scanner = new Scanner(System.in);
		String name = "";
		if(scanner.hasNextLine()) {
			name = scanner.nextLine();
		}
			
		System.out.println(a.getMessage() + name);
		
		scanner.close();
	}

}
