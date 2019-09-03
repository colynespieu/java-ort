package tests;

public class Main {
	public static void main(String[] args) {
		
		String result;
		Integer age = 151;

		//boolean verif = age >= 18;
		
		//String result = (verif) ? "Majeur" : "Mineur";
		
		//if (age >=150) {
		//	result = "mort !!!";
		//}
		//else if (age >=18) {
		//	result = "majeur"; 
		//}
		//else {
		//	result = "mineur";
		//}
		
		switch (age) {
		case 150:
			result = "mort";
			break;
		case 18:
			result = "majeur";
			break;
		case 13: 
			result = "mineur";
			break;
		default:
			result = "other";
		}
		System.out.println(result);
		
		
	}
}
