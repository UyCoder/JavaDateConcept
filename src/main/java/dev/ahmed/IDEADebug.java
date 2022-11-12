package dev.ahmed;

import org.testng.annotations.Test;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  12:12 PM
 */
public class IDEADebug {
    @Test
    public void testStringBuffer() {
        String str  = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1= new StringBuffer(str);
        System.out.println(sb1);

    }
}
