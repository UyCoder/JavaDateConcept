package dev.ahmed;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Ahmed Bughra
 * @create 2022-11-13  9:51 PM
 */
public class OtherClassTest {

    // System Class
    @Test
    public void test1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.home"));
    }



    /**
     *  Math Class
     *     java.lang.Math
     *           abs
     *           sin, cos, tan
     *           pow
     *           log
     *           exp
     *           random()
     */


    /**
     * BigInteger Class and BigDecimal Class
     *       java.math.BigInteger
     *       java.math.BigDecimal
     *
     */
    @Test
    public void test2() {
        BigInteger bigInteger = new BigInteger("123322312313412");
        BigDecimal bigDecimal = new BigDecimal("1232.3222");
        BigDecimal bigDecimal1 = new BigDecimal("123");
        System.out.println(bigInteger);
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal.divide(bigDecimal1, 15, BigDecimal.ROUND_HALF_UP));

    }

}
