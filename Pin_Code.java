/* Welcome to the PIN Code Matching Problem */

import java.util.regex.*;

public class Pin_Code {
	public static void main(String[] args) {
		System.out.println("Welcome to the Pin Code Problem");
		
		boolean matcher = "400088".matches("[\\d ]{6}");
		if(matcher == true) {
			System.out.println("Valid PIN Code");
		}else {
			System.out.println("Invalid PIN Code");
		}
	}
}
