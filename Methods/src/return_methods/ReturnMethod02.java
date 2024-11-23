package return_methods;

public class ReturnMethod02 {
    public static void main(String[] args) {
        ReturnMethod02 returnMethod02 = new ReturnMethod02();
        String fullName = returnMethod02.usernameAndLastNameConcat("kadir", "demircan");
        System.out.println(fullName);

        int usernameLength = returnMethod02.calculateUsernameLength("hasan");
        System.out.println(usernameLength);

        int usernameLength2 = returnMethod02.calculateUsernameLength("hasannnnn");
        System.out.println(usernameLength2);
    }

    String usernameAndLastNameConcat(String username, String lastName) {
        return username + lastName;
    }

    int calculateUsernameLength(String username) {
        return username.length();
    }
}
