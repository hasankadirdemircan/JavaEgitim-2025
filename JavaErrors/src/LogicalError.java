public class LogicalError {
    public static void main(String[] args) {
        int result1 = 5 + 4 * 3/2;
        int result2 = (5 + 4) * 3/2;
        int result3 = (5 + 4) * (3/2);
        int result4 = (5 + (4 * 3)) / 2;
        System.out.println(("result1: " + result1 + " result2: " + result2 + " result3: " + result3 +
                " result4: " + result4));


        int count;
        // Create the loop.
        for (count=1; count<=10; count++) ;
        {
            // Output the result.
            System.out.println("Count is " + count);
        }


        String style = "Bold";
        String style2 = "Bold";
        String style3 = new String("Bold");

        System.out.println(style);
        System.out.println(style2);
        System.out.println(style3);

        if(style.equals(style3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
