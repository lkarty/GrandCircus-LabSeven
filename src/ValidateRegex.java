import java.util.Scanner;

public class ValidateRegex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		do {
			String userName = Validator.getStringMatchingRegex(scan, "Please enter your name: ", "[a-zA-Z]+");

			String userPhone = Validator.getStringMatchingRegex(scan,
					"Please enter a valid phone number using format ddd-ddd-dddd: ", "^\\d{3}-\\d{3}-\\d{4}$");

			String userEmail = Validator.getStringMatchingRegex(scan, "Please enter a valid email: ",
					"^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");

			String userDate = Validator.getStringMatchingRegex(scan,
					"Please enter a valid date using format: dd/mm/yyyy ",
					"^^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");

			System.out.println("Thank you for your input!");

			System.out.println("\nDo you want to continue? (y/n)");

		} while (scan.next().equalsIgnoreCase("Y"));

		scan.close();

	}

}
