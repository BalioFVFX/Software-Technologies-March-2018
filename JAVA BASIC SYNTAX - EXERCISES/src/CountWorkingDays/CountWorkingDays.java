package CountWorkingDays;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        final Calendar startDate = Calendar.getInstance();
        final Calendar endDate = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        startDate.setTime(dateFormat.parse(input));
        input = scanner.nextLine();
        endDate.setTime(dateFormat.parse(input));
        Date dateEnd = endDate.getTime();
        int workingDays = 0;

        for (Date date = startDate.getTime(); date.getTime() <= dateEnd.getTime(); startDate.add(Calendar.DATE, 1), date = startDate.getTime()) {
            if(!isHoliday(startDate)){
                workingDays++;
            }
        }
        System.out.println(workingDays);
    }
    public static boolean isHoliday(Calendar calendar){
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int date = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);

        if(month == Calendar.JANUARY && date == 1
                || month == Calendar.MARCH && date == 3
                || month == Calendar.MAY && date == 1
                || month == Calendar.MAY && date == 6
                || month == Calendar.MAY && date == 24
                || month == Calendar.SEPTEMBER && date == 6
                || month == Calendar.SEPTEMBER && date == 22
                || month == Calendar.NOVEMBER && date == 1
                || month == Calendar.DECEMBER && date == 24
                || month == Calendar.DECEMBER && date == 25
                || month == Calendar.DECEMBER && date == 26
                || day == Calendar.SATURDAY
                || day == Calendar.SUNDAY){
            return true;
        }
        return false;
    }
}
