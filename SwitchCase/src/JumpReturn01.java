public class JumpReturn01 {

    public static void main(String[] args) {
        boolean tf = true;
        System.out.println("return keywordünden önce");

        if(tf) {
            System.out.println("if'in içi");
            return;
        }

        System.out.println("return keywordünden sonra");
    }
}
