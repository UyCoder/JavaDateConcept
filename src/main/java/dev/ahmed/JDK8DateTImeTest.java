package dev.ahmed;

import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  1:04 PM
 *
 *
 *
 * Old Date class:
 *  1. not changable
 *  2. start from 1900
 *  3. format can be Date not Calendar
 *  4. not secure on thread
 */
public class JDK8DateTImeTest {
    @Test
    public void test(){
        // old Date not correct . start with  1st month of 1900
        Date date = new Date(2021, 1, 2);
        System.out.println(date);
    }


    /**
     * LocalDate, LocalTime, LocalDateTime
     *          * we use LocalDateTime more
     */
    @Test
    public void test1(){
        // now()
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        // of()
        LocalDateTime of = LocalDateTime.of(2022, 11, 12, 2, 2, 3);
        System.out.println(of);

        // getX()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getYear());

        // not changable
        LocalDate localDate1 = localDate.withDayOfMonth(2);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime1 = localDateTime.withHour(10);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        //
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
    }

    /**
     * Instant
     */
    @Test
    public void testInstant(){
        // now()
        Instant instant = Instant.now(); // get as london time
        System.out.println(instant);

        // atOffset(ZoneOffset.ofHours(3))
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(3)); // istanbul time
        System.out.println(offsetDateTime);

        // toEpochMilli()   from 1970-01-01 00:00:00 milliseconds
        long l = instant.toEpochMilli();
        System.out.println(l);

        // ofEpochMilli()
        Instant instant1 = Instant.ofEpochMilli(1668250129554L);
        System.out.println(instant1);
    }


    /**
     * DateTimeFormatter
     */
    @Test
    public void testDateTimeFomatter()  {
        // method 1 : ISO_LOCAL_DATE_TIME
            // date to string
        DateTimeFormatter dTformatter =  DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime ldt = LocalDateTime.now();
        String strDate = dTformatter.format(ldt);
        System.out.println(strDate);
        System.out.println(ldt);
            // string to date
        TemporalAccessor parse = dTformatter.parse("2022-11-12T13:58:53.779387");
        System.out.println(parse);

        // method 2 : ofLocatlizedDateTime(FormatStyle.LONG)
        DateTimeFormatter dTformatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String formatDate1 = dTformatter1.format(ldt);
        System.out.println(formatDate1);

        DateTimeFormatter dformatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dformatter.format(LocalDate.now()));


        // method 3 : ofPattern("yyyy-MM-dd hh:mm:ss E")
        //   we use this method more
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E");
        String strDateTimePattern = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(strDateTimePattern);

        TemporalAccessor accessor = dateTimeFormatter.parse("2022-11-12 02:31:54 Sat");
        System.out.println(accessor);


    }


}
