package dev.ahmed;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  12:24 PM
 */
public class DateTimeTest {
    //simpleDateFormat implementation


    @Test
    public void testSimpleDateFormat() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        // insert date
        String str = "11/12/22, 12:28 PM";
        Date parse = sdf.parse(str);
        System.out.println(parse);

        //********** use date pattern ***************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        // insert date
        Date parse1 = sdf1.parse("2022-11-12 12:32:06");
        System.out.println(parse1);

    }

    /** Example:
     *          convert "2020-09-16" to java.sql.Date
     */

    @Test
    public void testDate() throws ParseException {
        String birthday = "2016-09-16";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf1.parse(birthday);
        System.out.println(parse);

        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);

    }
}
