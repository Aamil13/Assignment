package assignment_1;

import java.util.Scanner;

public class Student {
	
	static int roll;
	static String name;
	static float marks;
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your roll no. : ");
		roll = sc.nextInt();
		System.out.println("Please enter your name : ");
		name = sc.next();
		System.out.println("Please enter your marks : ");
		marks = sc.nextFloat();
		
	}
	
	public static void display() {
		System.out.println("Roll No: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
	
	public static void main(String[] args) {
		
		input();
		display();
		
	}
	

}
