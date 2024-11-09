public class LogicalOperators {

    public static void main(String[] args) {
        String userUsername = "hkd";
        String realUsername = "hkd";

        String userPassword = "123456";
        String realPassword = "123456";

        boolean usernameResult = (userUsername == realUsername) && (userPassword == realPassword);
        System.out.println("usernameResult : " + usernameResult);


        boolean usernameResult2 = (userUsername == realUsername) || (userPassword == realPassword);
        System.out.println("usernameResult2 : " + usernameResult2);
        System.out.println("usernameResult2 : " + !usernameResult2);

        if (usernameResult) {
            System.out.println("Giriş Başarılı");
        }
    }
}
