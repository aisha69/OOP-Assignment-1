import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; 
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current Date: " + year + "-" + month + "-" + day);
    }
}
