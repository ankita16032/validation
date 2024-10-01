package validation;

import java.util.Scanner;

public class EmailValidations {

	public void checkEmail(String email) {
		int a = email.indexOf("@");
		int d = email.lastIndexOf(".");
		if (a > -1 && d > -1 && a < d) {
			System.out.println("Valid Email Id");
		} else {
			System.out.println("Invalid Email Id");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmailValidations emailValidations = new EmailValidations();
		System.out.println("Enter your email id: ");
		String email = sc.next();
		emailValidations.checkEmail(email);

	}

}
