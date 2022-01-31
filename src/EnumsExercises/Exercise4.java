package EnumsExercises;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Exercise4 {
    public static void main(String[] args) {

        // 1 - Print todays Date and Time using LocalDate
        // 2 - Represent your date of birth using LocalDate
        // 3 - Add 100 days to your dob and print it

        LocalDate dateToday = LocalDate.now();
        System.out.println("The date today is:  " + dateToday);

        LocalDate myBirthday = LocalDate.of(1999, 12, 14);
        System.out.println("My Birthday is:  " + myBirthday);

        LocalDate oneHundredDays = myBirthday.plusDays(100);
        System.out.println("100 days after my birthday is: " + oneHundredDays);

    }
}
