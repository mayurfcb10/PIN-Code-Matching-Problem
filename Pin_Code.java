/* Welcome to the PIN Code Matching Problem */

import java.util.regex.*;
import java.util.*;

public class Pin_Code {


	public static void main(String[] args) {
		System.out.println("Welcome to the Pin Code Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PIN Code:");
		String patternValidate = sc.nextLine();

		boolean matcher = patternValidate.matches("^[0-9]{3}?(\s)[0-9]{3}$");
		if(matcher == true) {
			System.out.println("Valid PIN Code");
		}else {
			System.out.println("Invalid PIN Code");
		}
	}
}
