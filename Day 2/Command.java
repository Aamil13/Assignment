package assignment_1;

public class Command {
	public static void main(String[] args) {
		
		int x,y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		int sum = x+y;
		
		System.out.println("Sum : "+ sum);
	}

}
