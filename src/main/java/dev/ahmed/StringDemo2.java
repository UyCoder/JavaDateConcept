package dev.ahmed;

import org.testng.annotations.Test;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  11:53 AM
 */
public class StringDemo2 {
    /**
     * get the most same characters from two strings
     * str1= "asdfbfefdndfhellouiodef"; str2= "cvhellobnm";
     */

    public String getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {

            String maxStr = (str1.length() >= str2.length())? str1 : str2;
            String minStr = (str1.length() <= str2.length())? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {

                for (int x=0,y=length-i ; y<=length ; x++,y++) {
                    String subStr = minStr.substring(x,y);
                    if (maxStr.contains(subStr)){
                        return subStr;
                    }
                }

            }
        }
        return null;
    }

    @Test
    public void testString(){
        String str1= "asdfbfefdndfhellouiodef", str2= "cvhellobnm";
        String maxSameString = getMaxSameString(str1,str2);
        System.out.println(maxSameString);
    }
}
