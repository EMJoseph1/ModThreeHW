package daytwohw;

public class daytwogradehw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade(72);
		week(4);
		coolOrNot(18);
	}
	public static void grade(int letter) {
		if(letter >= 90 ) {
			System.out.println('A');
		}
		if(letter < 90  && letter >= 80) {
			System.out.println('B');
		}
		if(letter < 80 && letter >= 70) {
			System.out.println('C');
		}
		if(letter < 70 && letter >= 55) {
			System.out.println('D');
		}
		if(letter < 55) {
			System.out.print('F');
		}
	}
	
	public static void week(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	public static void coolOrNot(int num) {
		if(num % 2 != 0) {
			System.out.println("Cool");
		}
		if(num % 2 == 0 && 5 > num && num > 2){
			System.out.println("Not Cool");
		}
		if(num % 2 == 0 && 20 > num && num > 6){
			System.out.println("Cool");
		}
		if(num % 2 == 0 && num > 20) {
			System.out.println("Not Cool");
		}
	}
}
