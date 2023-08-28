import java.time.LocalDate;
import java.time.LocalTime;
public class DateOfBirth {
    public static void main(String[]args) {
        LocalDate dob = LocalDate.of(1990,12,24);
        LocalTime time = LocalTime.now();

        System.out.println(dob);
        System.out.println(time);
    }
}