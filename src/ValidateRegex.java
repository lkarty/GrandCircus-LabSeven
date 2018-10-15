import java.util.Scanner;

public class ValidateRegex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userName = Validator.getStringMatchingRegex(scan, "Please enter your name: ", "[a-zA-Z]+");
		scan.nextLine(); // need to clear out scanner to avoid infinite loop


		String userPhone = Validator.getStringMatchingRegex(scan,
				"Please enter a valid phone number using format ddd-ddd-dddd: ", "^\\d{3}-\\d{3}-\\d{4}$");
		
		scan.nextLine(); // need to clear out scanner to avoid infinite loop

		
		String userEmail = Validator.getStringMatchingRegex(scan, "Please enter a valid email: ",
				"^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
	}
	scan.nextLine(); // need to clear out scanner to avoid infinite loop

	
	String userDate = Validator.getStringMatchingRegex(scan, "Please enter a valid date: ",
			"^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
}


}
