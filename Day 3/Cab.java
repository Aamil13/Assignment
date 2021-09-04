package assignment3;

import java.util.Scanner;

class Cab {

	int fare;
	int d;

	
	//constructor
	public Cab() {
		fare = 30; //base fare
	}
	public Cab(int amt) {
		fare = amt;
	}
	
	void showFare() {
		System.out.println("Total Fare: RS : " + fare);
	}
}

class RideCab{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cd;
		System.out.println("Enter the cab distance from user : ");
		cd = sc.nextInt();
		if(cd > 5) {
			//extra 1- for each kilometer exceeding 5
			//using parameterized constructor
			Cab obj = new Cab(30 + 10 * (cd - 5));
			System.out.println("Enter the distance travelled : ");
			obj.d = sc.nextInt();
			
			obj.fare = obj.fare + 10 * cd;
			obj.showFare();
		}
		else {
			//else base fare is default 30 rs
			//using default constructor
			Cab obj = new Cab();
			
			System.out.println("Enter the distance travelled : ");
			obj.d = sc.nextInt();
			
			obj.fare = obj.fare + 10 * cd;
			obj.showFare();
		}
		
		
	}
}
