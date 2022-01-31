package EnumsExercises;

import java.util.Locale;

public class Exercise1_3 {
    public static void main(String[] args) {
        System.out.println("T-Shirt size : " + TshirtSize.LARGE);

        for (TshirtSize size: TshirtSize.values()){
            String newSize = size.name(); //converts enum list into string called 'newSize'
            System.out.println(newSize.toLowerCase(Locale.ROOT)); //toLowerCase function only works on strings.
        }
    }
}
