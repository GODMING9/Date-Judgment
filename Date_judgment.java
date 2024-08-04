import java.util.Scanner;

public class problem {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // 키보드 입력을 받을 수 있도록 프로그램 설정
		System.out.println("Please enter a date to be checked");
		String date = keyboard.nextLine(); // 문자열로 년,월,일 받기
	    String[] d = (date).split("/"); // "/"를 기준으로 각 문자를 배열에 저장하기
	    int day = Integer.parseInt(d[1]); // 일의 자료형 변환
	    int year = Integer.parseInt(d[2]); // 년의 자료형 변환
	    System.out.println("date is "+d[0]+":"+d[1]+":"+d[2]);
	    System.out.println("Yout date is "+d[0]+"/"+d[1]+"/"+d[2]);
	    switch(d[0]) {
	    	case "1": // 1월일 때
	    		if (day>0&&day<32) // 일이 1에서 31일까지의 값일 때
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in January.");
	    		}
	    		break;
	    	case "3":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in March.");
	    		}
	    		break;
	    	case "5":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in May.");
	    		}
	    		break;
	    	case "7":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in July.");
	    		}
	    		break;
	    	case "8":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in August.");
	    		}
	    		break;
	    	case "10":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in October.");
	    		}
	    		break;
	    	case "12":
	    		if (day>0&&day<32)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 31 in December.");
	    		}
	    		break;
	    	case "2": // 2월일 때
	    		if(year%100!=0 && year%4==0) { // 윤년일 때
	    			if (day>0||day<30) // 일이 1에서 29까지의 값일 때
	    				System.out.println("It is a valid date.");
	    			else {
	    				System.out.println("It is not a valid date.");
	    				System.out.println("The reason it is invalid: The day is greater than 29 in February in a leap year.");
	    			}
	    		}	
	    		else {
	    			if (day>0&&day<29)
	    				System.out.println("It is a valid date.");
	    			else if(day>29){
	    				System.out.println("It is not a valid date.");
	    				System.out.println("The reason it is invalid: The day is greater than 28 in February in a non leap year.");
	    			}
	    		}
	    		break;
	    	case "4": // 4월일 때
	    		if (day>0&&day<31) // 일이 1에서 30까지의 값일 때
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 30 in April");
	    		}
	    		break;
	    	case "6":
	    		if (day>0&&day<31)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 30 in June");
	    		}
	    		break;
	    	case "9":
	    		if (day>0&&day<31)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 30 in September");
	    		}
	    		break;
	    	case "11":
	    		if (day>0&&day<31)
	    			System.out.println("It is a valid date.");
	    		else {
	    			System.out.println("It is not a valid date.");
		    		System.out.println("The reason it is invalid: The day is greater than 30 in November");
	    		}
	    		break;
	    	default: // 월이 1에서 12까지의 값이 아닐 때
	    		System.out.println("It is not a valid date.");
	    		System.out.println("The reason it is invalid: The month value is not from 1 to 12.");
	    		break;
	    }
	}
}
