package another;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class HowToDateTime {
    public static void main(String[] args) {
        // Current date
        {
            // Java 7-
            Date d = new Date();
            System.out.println(d);
            // Java 8+
            LocalDate ld = LocalDate.now();
            System.out.println(ld);
        }
        System.out.println();
        // 30 january 2018 as short format (DD.MM.YYYY)
        {
            final int MY_DAY = 30;
            final int MY_YEAR = 2018;
            // Java 7-
            Calendar calendar = Calendar.getInstance();
            calendar.set(MY_YEAR, Calendar.JANUARY, MY_DAY);
            Date jan7 = calendar.getTime();
            DateFormat df7 = DateFormat.getDateInstance(DateFormat.SHORT);
            System.out.println(df7.format(jan7));
            // Java 8+
            LocalDate jan8 = LocalDate.of(MY_YEAR, Month.JANUARY, MY_DAY);
            DateTimeFormatter dtf8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            System.out.println(jan8.format(dtf8));
            System.out.println(dtf8.format(jan8));
        }
        System.out.println();
        {
//        LocalDate yearMinus1 = LocalDate.of(-1, 2, 0); // CAN'T DO THIS -> Day out of bound -> Exception
//        LocalDate yearMinus1 = LocalDate.of(-1, 13, 28); // CAN'T DO THIS -> Month out of bound -> Exception
            LocalDate yearMinus1 = LocalDate.of(-1, 2, 28); // 28 feb 0002 year
            LocalDate year50 = LocalDate.of(50, 5, 5); // 5 may 0050 year
            DateTimeFormatter dtf8full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
            System.out.println(dtf8full.format(yearMinus1));
            System.out.println(dtf8full.format(year50));
        }
        System.out.println();

        // 20 january 2020 formatted by pattern
        {
            LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
            LocalTime time = LocalTime.of(11, 12, 34);
            LocalDateTime dateTime = LocalDateTime.of(date, time);
            DateTimeFormatter fM4 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
            DateTimeFormatter fM3 = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");
            DateTimeFormatter fM2 = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
            DateTimeFormatter fM1 = DateTimeFormatter.ofPattern("M dd, yyyy, hh:mm");
            System.out.println(dateTime.format(fM4)); // January 20, 2020, 11:12
            System.out.println(dateTime.format(fM3));
            System.out.println(dateTime.format(fM2));
            System.out.println(dateTime.format(fM1));
        }
        System.out.println();
        // == PERIOD ===============================================
        {
            Period annually = Period.ofYears(1); // every 1 year
            Period quarterly = Period.ofMonths(3); // every 3 months
            Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
            Period everyOtherDay = Period.ofDays(2); // every 2 days
            Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
            System.out.println(everyYearAndAWeek);

            Period wrong = Period.ofYears(1).ofWeeks(1); // every week
            System.out.println(wrong);

            Period wrong2 = Period.ofYears(1);
            wrong2 = Period.ofWeeks(7);
            System.out.println(wrong2);
        }
        System.out.println();
        {
            System.out.println(LocalDate.of(2014, 6, 21)); // 2014-06-21
            System.out.println(LocalDate.of(2014, Calendar.JUNE, 21)); // 2014-05-21
            System.out.println(LocalDate.of(2014, Month.JUNE, 21)); // 2014-06-21
        }
        System.out.println();
        {
            LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
            date.plusDays(2);
            date.plusYears(3);
            System.out.println(date.getYear() + " " + date.getMonth() + " "
                    + date.getDayOfMonth()); // 2018 APRIL 30
            // LocalDate is immutable
        }
        System.out.println();
        {
            LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
            Period p = Period.of(1, 2, 3);
            d = d.minus(p);
            DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
            DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
            DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
            DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
            System.out.println(d.format(f));
            System.out.println(d.format(f2));
//            System.out.println(d.format(f3)); // exception
//            System.out.println(d.format(f4)); // exception
        }
        System.out.println();
        {
            LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
            Period p = Period.ofDays(1).ofYears(2);
            d = d.minus(p);
            DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                    .SHORT);
            System.out.println(f.format(d));
        }
    }
}
