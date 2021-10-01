package Java;

public class mod3hw {
	public static void main(String name[]) {

		
		System.out.println("Question 1");
//Question 1
	int grade = 80;
	
	if(grade >= 90) {
		System.out.println("A");
	}
	else if(grade >= 80) {
		System.out.println("B");
	}
	else if(grade >= 70) {
		System.out.println("C");
	}
	else if(grade >= 55){
		System.out.println("D");
	}
	else{
		System.out.println("F");
	}
		
	System.out.println("Question 2");

//Question 2
	int day = 4;
	
	switch(day){
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("Invalid Day");
		break;
	}
		
		
		
		
		System.out.println("Question 3");
		
// Question #3

	int num = 10;
			
		if(num % 2 != 1) {
			System.out.println("Cool");
		}
		else if (num >=5){
			System.out.println("Not Cool");
		}
		else if (num <=6 && num >=20) {
			System.out.println("Cool");
		}
		else if (num > 20){
			System.out.println("Not Cool");
		}
}
}
