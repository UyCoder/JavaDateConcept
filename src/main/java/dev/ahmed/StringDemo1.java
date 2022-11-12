package dev.ahmed;

import org.testng.annotations.Test;

/**
 * @author Ahmed Bughra
 * @create 2022-11-11  5:51 PM
 */
public class StringDemo1 {
    /**
     * get how many times "ab" appears in "absdfdbaafdfabdfdsfabsdfe"
     */
    public int getCount(String mainStr, String subStr ){
        int mainLength = mainStr.length();
        int subLength= subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {

            // 1st solution
//            while ((index = mainStr.indexOf(subStr)) !=-1) {
//                count++;
//                mainStr = mainStr.substring(index+subStr.length());
//            }

            // 2nd solution
            while((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }


            return count;
        }else {
            return 0;
        }
    }
    @Test
    public void testGetCount(){
        String mainStr = "absdfdbaafdfabdfdsfabsdfe";
        String subStr = "ab";
        System.out.println(getCount(mainStr, subStr));
    }
}


