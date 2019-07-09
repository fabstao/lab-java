package sts; // Need to put in sts folder following package sts

public class Test1 {

	public static boolean isValid(final String text) {
		return (text + ".").matches("((([1]\\d\\d)|(2[0-4]\\d)|(25[0-5])|(\\d{1,2}))\\.){4}");
	}

	public static void main(final String[] args) {

		/*
		 * Examine the function 'isValid'. What does it validate?
		 * For which cases the validation fails?
		 * Validation is successful for IPv4 addresses and netmasks
		 * Validation fails for anything else
		 */
		
		String input = args[0];
		String result = Test1.isValid(input) ? "valid" : "not valid";
		System.out.println("Input " + input + " is " + result);
	}

}
