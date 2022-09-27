import java.util.Scanner;
class UsernameValidator {
    static{
        regex="[a-zA-Z]{1}[\\w]{7,29}";
    }
    public static final String regex;
}




public class Valid_Username {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regex)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


