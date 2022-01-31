package EnumsExercises;

import javax.sound.midi.Soundbank;
import java.sql.Ref;
import java.time.LocalDate;
import java.time.Period;

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

        //HOW DO I INVOKE THE METHOD?!

    }
    // write a method that calculate age on any given date
    private int calculateAge(LocalDate date){
        LocalDate birthday = LocalDate.of(1999, 12, 14);
        LocalDate given = LocalDate.of(2022, 01, 31);

        Period p = Period.between(birthday, given);

//        System.out.println(p.getYears());
//        System.out.println(p.getMonths());
//        System.out.println(p.getDays());

        int age = p.getYears();

        System.out.println(age);
        return -1;

    }
}
