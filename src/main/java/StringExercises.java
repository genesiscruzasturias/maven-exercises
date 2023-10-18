import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string!");
        String input = sc.nextLine();

        String numbers = "1234567890";

        if (StringUtils.isAlpha(input)){
            System.out.println("You entered: " + input);
            System.out.println("Flipped case: " + StringUtils.swapCase(input));
            System.out.println("Reversed Case: " + StringUtils.reverse(input));
        } else if (StringUtils.isNumeric(input) || StringUtils.isAlphanumeric(input)) {
            System.out.println("Invalid. That is not a string.");
//            System.out.println("Please enter a string!");
//            String inputTwo = sc.nextLine();
        }



    }
}
